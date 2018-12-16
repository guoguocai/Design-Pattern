package com.guoguocai.abstractfactory.demo2.departmentimp;

import com.guoguocai.abstractfactory.demo2.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo2.po.Department;

/**
 * @auther guoguocai
 * @date 2018/12/16 14:54
 */
public class OracleDepartOper implements IDepartmentOperation {

    @Override
    public void insertDepartment(Department department) {
        System.out.println("[Oracle]新增一条 Department 记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("[Oracle]根据 ID 获取 Department 表中一条记录");
        return null;
    }
}
