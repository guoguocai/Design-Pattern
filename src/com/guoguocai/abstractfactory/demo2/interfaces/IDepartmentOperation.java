package com.guoguocai.abstractfactory.demo2.interfaces;

import com.guoguocai.abstractfactory.demo2.po.Department;

/**
 * @auther guoguocai
 * @date 2018/12/16 14:48
 */
public interface IDepartmentOperation {

    void insertDepartment(Department department);

    Department getDepartment(int id);
}
