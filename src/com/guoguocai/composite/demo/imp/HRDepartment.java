package com.guoguocai.composite.demo.imp;

import com.guoguocai.composite.demo.abs.Company;

/**
 * 人力资源部
 *
 * @auther guoguocai
 * @date 2019/1/14 22:20
 */
public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int depth) {
        String len = "";
        for (int i = 0; i < depth; i++) {
            len = len + "-";
        }
        System.out.println(len + " " +name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " 员工招聘培训管理");
    }
}
