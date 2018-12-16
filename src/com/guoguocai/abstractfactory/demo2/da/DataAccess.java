package com.guoguocai.abstractfactory.demo2.da;

import com.guoguocai.abstractfactory.demo2.departmentimp.OracleDepartOper;
import com.guoguocai.abstractfactory.demo2.departmentimp.SqlServerDepartOper;
import com.guoguocai.abstractfactory.demo2.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo2.interfaces.IUserOperation;
import com.guoguocai.abstractfactory.demo2.userimp.OracleUserOperation;
import com.guoguocai.abstractfactory.demo2.userimp.SqlServerUserOperation;

/**
 * DataAccess 类取代之前的 IFactory、OracleFactory、SqlServerFactory 工厂类。
 * 用一个简单工厂模式来实现。
 *
 * @auther guoguocai
 * @date 2018/12/16 14:38
 */
public class DataAccess {

    /* 在这里就预先设置好数据库的名称 */
    private static final String db = "SqlServer";
//    private static final String db = "Oracle";


    public static IUserOperation createUserOperation() {
        IUserOperation userOperation = null;
        switch (db) {
            case "SqlServer":
                userOperation = new SqlServerUserOperation();
                break;
            case "Oracle":
                userOperation = new OracleUserOperation();
                break;
        }
        return userOperation;
    }


    public static IDepartmentOperation createDepartOper() {
        IDepartmentOperation departOper = null;
        switch (db) {
            case "SqlServer":
                departOper = new SqlServerDepartOper();
                break;
            case "Oracle":
                departOper = new OracleDepartOper();
                break;
        }
        return departOper;
    }
}
