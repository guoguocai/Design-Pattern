package com.guoguocai.composite.demo.abs;

/**
 * 公司抽象类
 *
 * @auther guoguocai
 * @date 2019/1/14 22:07
 */
public abstract class Company {

    protected String name;

    public Company(String name) {
        this.name = name;
    }

    public abstract void add(Company company);
    public abstract void remove(Company company);
    public abstract void display(int depth);//显示
    public abstract void lineOfDuty();//履行职责（因为不同的部门需要履行不同的职责）
}
