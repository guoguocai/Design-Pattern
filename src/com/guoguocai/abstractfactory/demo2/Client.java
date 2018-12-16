package com.guoguocai.abstractfactory.demo2;

import com.guoguocai.abstractfactory.demo2.da.DataAccess;
import com.guoguocai.abstractfactory.demo2.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo2.interfaces.IUserOperation;
import com.guoguocai.abstractfactory.demo2.po.Department;
import com.guoguocai.abstractfactory.demo2.po.User;

/**
 * 由于在 DataAccess 类中已经预设了数据库，
 * 因此在客户端只需调用即可。
 *
 * 采用这样的结构之后，一旦增加新的数据库或是
 * 新的表操作，只需要修改 DataAccess 类即可，
 * 相比 demo1 而言修改的类变少了。
 *
 * 但是同时也带来了简单工厂模式的缺点。
 *
 * @auther guoguocai
 * @date 2018/12/16 14:55
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("Demo2:");

        User user = new User();
        IUserOperation userOper = DataAccess.createUserOperation();
        userOper.insertUser(user);
        userOper.getUser(1);

        Department department = new Department();
        IDepartmentOperation departOper = DataAccess.createDepartOper();
        departOper.insertDepartment(department);
        departOper.getDepartment(1);
    }
}
