package com.guoguocai.agent.demo2.dynamic;

import com.guoguocai.agent.demo2.external.Tank;
import com.guoguocai.agent.demo2.interfaces.InvocationHandler;
import com.guoguocai.agent.demo2.interfaces.Moveable;

import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

public class GeneralProxy {

    public static Object newProxyInstance(Class interfaced, InvocationHandler handler) {
        String proxyStr =
                "public class MyProxy implements " + interfaced.getName() + " {\r\n" +
                "    " + interfaced.getName() + " tank;\r\n" +
                "    public MyProxy(" + interfaced.getName() + " tank) {\r\n" +
                "        this.tank = tank;\r\n" +
                "    }\r\n" +
                "    @Override\r\n" +
                "    public void move() {\r\n" +
                "        System.out.println(\"Tank move startTime: \" + System.currentTimeMillis());\r\n" +
                "        tank.move();\r\n" +
                "        System.out.println(\"Tank move endTime: \" + System.currentTimeMillis());\r\n" +
                "    }\r\n" +
                "}"
                ;
        // 1.编译字符串源码
        try {
            // 先将字符串写入一个文件（文件位置不重要，代理类名也不重要）
            String fileName = "D:\\java\\MyProxy.java";
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            fw.write(proxyStr);
            fw.flush();
            fw.close();
            // 用 JDK 自带的编译器（其他工具包比如 CGLib、ASM，能直接生成二进制文件）
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
            Iterable units = fileManager.getJavaFileObjects(fileName);
            JavaCompiler.CompilationTask t = compiler.getTask(null, fileManager, null, null, null, units);
            t.call();
            fileManager.close();

            // 2.装载进内存
            URL[] urls = new URL[] {new URL("file:/" + "D:\\java\\")};
            URLClassLoader urlLoader = new URLClassLoader(urls);
            Class c = urlLoader.loadClass("MyProxy");

            // 3.生成实例
            // 根据参数获取构造方法
            Constructor ctr = c.getConstructor(Moveable.class);
            return ctr.newInstance(new Tank());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
