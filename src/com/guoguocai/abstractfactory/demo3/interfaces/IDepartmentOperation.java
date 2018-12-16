package com.guoguocai.abstractfactory.demo3.interfaces;

import com.guoguocai.abstractfactory.demo3.po.Department;

/**
 * @auther guoguocai
 * @date 2018/12/16 17:08
 */
public interface IDepartmentOperation {

    void insertDepartment(Department department);

    Department getDepartment(int id);
}
