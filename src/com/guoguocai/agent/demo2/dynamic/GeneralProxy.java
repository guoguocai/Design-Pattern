package com.guoguocai.agent.demo2.dynamic;

import com.guoguocai.agent.demo2.interfaces.InvocationHandler;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class GeneralProxy {

    public static Object newProxyInstance(Class interfaced, InvocationHandler handler) {

        // 每个接口的方法名不可能一样，并且一个接口可能有多个方法需要实现，先组装这部分
        String methodStr = "";
        Method[] methods = interfaced.getMethods();
        for (Method method : methods) {
            methodStr +=
                    "    @Override\r\n" +
                    "    public void " + method.getName() + "() {\r\n" +
                    "        try {\r\n" +
                    "            Method mtd = " + interfaced.getName() + ".class.getMethod(\"" + method.getName() + "\");\r\n" +
                    "            h.invoke(mtd, this);\r\n" +
                    "        } catch (Exception e) {\r\n" +
                    "            e.printStackTrace();\r\n" +
                    "        }\r\n" +
                    "    }\r\n"
            ;
        }

        // 拼接完整的代理类字符串
        // 这里看不直观，写入文件后再看就会发现，其实就是复用了静态代理类的写法
        String proxyStr =
                "import com.guoguocai.agent.demo2.interfaces.InvocationHandler;\r\n" +
                "import java.lang.reflect.Method;\r\n" +
                "public class MyProxy implements " + interfaced.getName() + " {\r\n" +
                "    InvocationHandler h;\r\n" +
                "    public MyProxy(InvocationHandler h) {\r\n" +
                "        this.h = h;\r\n" +
                "    }\r\n" +
                methodStr +
                "}"
                ;

        // 1.编译代理类字符串
        try {
            // 先将字符串写入一个文件（文件位置不重要，代理类名也不重要）
            String fileName = "D:\\java\\MyProxy.java";
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            fw.write(proxyStr);
            fw.flush();
            fw.close();
            // 用 JDK 自带的编译器生成 .class 文件（其他工具包比如 CGLib、ASM，能直接生成二进制码运行）
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
            Iterable units = fileManager.getJavaFileObjects(fileName);
            JavaCompiler.CompilationTask t = compiler.getTask(null, fileManager, null, null, null, units);
            t.call();
            fileManager.close();

            // 2.装载 .class 文件进内存
            URL[] urls = new URL[] {new URL("file:/" + "D:\\java\\")};
            URLClassLoader urlLoader = new URLClassLoader(urls);
            Class c = urlLoader.loadClass("MyProxy");

            // 3.生成实例
            // 根据参数类型获取代理类对应的构造方法，有参传参
            Constructor ctr = c.getConstructor(InvocationHandler.class);
            return ctr.newInstance(handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
