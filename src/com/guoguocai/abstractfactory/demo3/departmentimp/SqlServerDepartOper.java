package com.guoguocai.abstractfactory.demo3.departmentimp;

import com.guoguocai.abstractfactory.demo3.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo3.po.Department;

/**
 * @auther guoguocai
 * @date 2018/12/16 17:09
 */
public class SqlServerDepartOper implements IDepartmentOperation {

    @Override
    public void insertDepartment(Department department) {
        System.out.println("[SQL Server]新增一条 Department 记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("[SQL Server]根据 ID 获取 Department 表中一条记录");
        return null;
    }
}

