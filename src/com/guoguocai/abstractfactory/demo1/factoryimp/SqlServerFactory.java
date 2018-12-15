package com.guoguocai.abstractfactory.demo1.factoryimp;

import com.guoguocai.abstractfactory.demo1.departmentimp.SqlServerDepartOper;
import com.guoguocai.abstractfactory.demo1.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo1.interfaces.IFactory;
import com.guoguocai.abstractfactory.demo1.interfaces.IUserOperation;
import com.guoguocai.abstractfactory.demo1.userimp.SqlServerUserOperation;

/**
 * @auther guoguocai
 * @date 2018/12/15 22:00
 */
public class SqlServerFactory implements IFactory {

    @Override
    public IUserOperation createUserOperation() {
        return new SqlServerUserOperation();
    }

    @Override
    public IDepartmentOperation createDepartmentOperation() {
        return new SqlServerDepartOper();
    }
}
