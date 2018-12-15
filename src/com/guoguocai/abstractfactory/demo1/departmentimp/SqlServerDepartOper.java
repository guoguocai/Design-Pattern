package com.guoguocai.abstractfactory.demo1.departmentimp;

import com.guoguocai.abstractfactory.demo1.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo1.po.Department;

/**
 * @auther guoguocai
 * @date 2018/12/15 22:18
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
