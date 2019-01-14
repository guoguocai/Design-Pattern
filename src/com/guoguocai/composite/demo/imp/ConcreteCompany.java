package com.guoguocai.composite.demo.imp;

import com.guoguocai.composite.demo.abs.Company;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体公司类
 *
 * @auther guoguocai
 * @date 2019/1/14 22:11
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
        children.add(company);
    }

    @Override
    public void remove(Company company) {
        children.remove(company);
    }

    @Override
    public void display(int depth) {

        String len = "";
        for (int i = 0; i < depth; i++) {
            len = len + "-";
        }
        System.out.println(len + " " +name);

        for (Company component:
             children) {
            component.display(depth + 2);
        }
    }

    // 履行职责
    @Override
    public void lineOfDuty() {
        for (Company component:
             children) {
            component.lineOfDuty();
        }
    }
}
