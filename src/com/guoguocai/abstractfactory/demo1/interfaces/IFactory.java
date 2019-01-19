package com.guoguocai.abstractfactory.demo1.interfaces;

/**
 * 在增加部门表（Department）时，除了要增加
 * IDepartmentOperation、OracleDepartOper、SqlServerDepartOper
 * 这三个新的类以外，还要修改原有的
 * IFactory、OracleFactory、SqlServerFactory
 * 这三个工厂类才可以完全实现，实际上，这样大批量地改动原有类的做法是不好的。
 * 是 demo2 的缺点之一。
 *
 * @auther guoguocai
 * @date 2018/12/15 21:57
 */
public interface IFactory {

    IUserOperation createUserOperation();

    IDepartmentOperation createDepartmentOperation();
}
