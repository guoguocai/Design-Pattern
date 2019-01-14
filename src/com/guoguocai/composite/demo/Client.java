package com.guoguocai.composite.demo;

import com.guoguocai.composite.demo.imp.ConcreteCompany;
import com.guoguocai.composite.demo.imp.FinanceDepartment;
import com.guoguocai.composite.demo.imp.HRDepartment;

/**
 * 结构层次为部分与整体，且对象统一使用，
 * 即分公司其实就是一个部门。
 *
 * @auther guoguocai
 * @date 2019/1/14 22:25
 */
public class Client {

    public static void main(String[] args) {

        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部"));
        root.add(new FinanceDepartment("总公司财务部"));

        ConcreteCompany company = new ConcreteCompany("上海华东分公司");
        company.add(new HRDepartment("上海华东分公司人力资源部"));
        company.add(new FinanceDepartment("上海华东分公司财务部"));
        root.add(company);

        ConcreteCompany subComp1 = new ConcreteCompany("南京办事处");
        subComp1.add(new HRDepartment("南京办事处人力资源部"));
        subComp1.add(new FinanceDepartment("南京办事处财务部"));
        company.add(subComp1);

        ConcreteCompany subComp2 = new ConcreteCompany("杭州办事处");
        subComp2.add(new HRDepartment("杭州办事处人力资源部"));
        subComp2.add(new FinanceDepartment("杭州办事处财务部"));
        company.add(subComp2);

        System.out.println("结构图：");
        root.display(1);

        System.out.println("职责：");
        root.lineOfDuty();
    }
}
