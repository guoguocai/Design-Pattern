package com.guoguocai.abstractfactory.demo3;

import com.guoguocai.abstractfactory.demo3.da.DataAccess;
import com.guoguocai.abstractfactory.demo3.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo3.interfaces.IUserOperation;
import com.guoguocai.abstractfactory.demo3.po.Department;
import com.guoguocai.abstractfactory.demo3.po.User;

/**
 * @auther guoguocai
 * @date 2018/12/16 17:02
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("Demo3:");

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
