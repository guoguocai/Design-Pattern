package com.guoguocai.composite.demo.imp;

import com.guoguocai.composite.demo.abs.Company;

/**
 * 财务部
 *
 * @auther guoguocai
 * @date 2019/1/14 22:23
 */
public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(name + " 公司财务收支管理");
    }
}
