package com.guoguocai.abstractfactory.demo1.interfaces;

import com.guoguocai.abstractfactory.demo1.po.Department;

/**
 * @auther guoguocai
 * @date 2018/12/15 22:16
 */
public interface IDepartmentOperation {

    void insertDepartment(Department department);

    Department getDepartment(int id);
}
