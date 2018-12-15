package com.guoguocai.abstractfactory.demo1;

import com.guoguocai.abstractfactory.demo1.factoryimp.OracleFactory;
import com.guoguocai.abstractfactory.demo1.factoryimp.SqlServerFactory;
import com.guoguocai.abstractfactory.demo1.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo1.interfaces.IFactory;
import com.guoguocai.abstractfactory.demo1.interfaces.IUserOperation;
import com.guoguocai.abstractfactory.demo1.po.Department;
import com.guoguocai.abstractfactory.demo1.po.User;

/**
 * 实际上，一个系统访问数据库表的客户端不可能只有一个，
 * 因此如果整个系统要更换使用的数据库的话，那么就要将
 * 客户端中所有的:（举例）
 * IFactory factory = new OracleFactory();
 * 改为: IFactory factory = new SqlServerFactory();
 * 不能实现改动一处就更改全部的要求，这是抽象工厂 demo1
 * 的缺点之一。
 *
 * @auther guoguocai
 * @date 2018/12/15 22:02
 */
public class Client {

    public static void main(String[] args) {

        /* 切换数据库时只需要修改下面的工厂子类名称即可 */
        IFactory factory = new OracleFactory();
//        IFactory factory = new SqlServerFactory();

        User user = new User();
        IUserOperation userOper = factory.createUserOperation();
        userOper.insertUser(user);
        userOper.getUser(1);

        Department department = new Department();
        IDepartmentOperation departOper = factory.createDepartmentOperation();
        departOper.insertDepartment(department);
        departOper.getDepartment(1);
    }
}
