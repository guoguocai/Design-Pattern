package com.guoguocai.abstractfactory.demo3.da;

import com.guoguocai.abstractfactory.demo3.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo3.interfaces.IUserOperation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 所有用到简单工厂的地方，都可以考虑用反射来
 * 去除 switch 或者 if，从而解除分支判断带
 * 来的耦合。
 *
 * @auther guoguocai
 * @date 2018/12/16 17:16
 */
public class DataAccess {


    /* 获取数据库名称 */
    private static final String db = DataAccess.getDBName();

    /* 从配置文件中获取数据库名 */
    public static String getDBName() {
        String dbName = "";
        Properties prop = new Properties();
        InputStream inputStream = DataAccess.class.getResourceAsStream("DBName.properties");
        try {
            prop.load(inputStream);
            dbName = prop.getProperty("DBName");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return dbName;
    }


    public static IUserOperation createUserOperation() {

        /**
         * 拼接字符串，注意 className 包含包名。
         *
         * Demo1、Demo2 都是用的具体的数据库类来实例化，让其不得不
         * 进行 switch 或者是 if 的判断；Demo3 的核心就在于反射用
         * 字符串来实例化对象，而字符串存在变量中是可以更换的。
         */
        String className = "com.guoguocai.abstractfactory.demo3.userimp." + db +"UserOperation";

        try {
            //获取以className字符串为名的类
            Class<IUserOperation> userOperation
                    = (Class<IUserOperation>) Class.forName(className);
            //返回类的实例
            return userOperation.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }


    public static IDepartmentOperation createDepartOper() {

        String className = "com.guoguocai.abstractfactory.demo3.departmentimp." + db +"DepartOper";

        try {
            Class<IDepartmentOperation> departOper
                    = (Class<IDepartmentOperation>) Class.forName(className);
            return departOper.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /* 福利：几种加载配置文件的方式。 */
    public static void main(String[] args) {
        // 加载与DataAccess.java同级的配置文件，才用相对路径加载
//        InputStream inputStream = DataAccess.class.getResourceAsStream("DBName.properties");
//        System.out.println(inputStream);

        // 加载位于src/mian/java（classpath）目录下的配置文件，使用classLoader加载器
//        inputStream = DataAccess.class.getClassLoader().getResourceAsStream("DBName2.properties");
//        System.out.println(inputStream);

        // 加载位于src/main/resources目录下的文件，因为对于eclipse来这说也是classpath，使用classLoader加载器
//        inputStream = DataAccess.class.getClassLoader().getResourceAsStream("DBName3.properties");
//        System.out.println(inputStream);

        System.out.println(DataAccess.getDBName()+"...");
    }
}
