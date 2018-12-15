package com.guoguocai.abstractfactory.demo1.factoryimp;

import com.guoguocai.abstractfactory.demo1.departmentimp.OracleDepartOper;
import com.guoguocai.abstractfactory.demo1.interfaces.IDepartmentOperation;
import com.guoguocai.abstractfactory.demo1.interfaces.IFactory;
import com.guoguocai.abstractfactory.demo1.interfaces.IUserOperation;
import com.guoguocai.abstractfactory.demo1.userimp.OracleUserOperation;

/**
 * @auther guoguocai
 * @date 2018/12/15 22:01
 */
public class OracleFactory implements IFactory {

    @Override
    public IUserOperation createUserOperation() {
        return new OracleUserOperation();
    }

    @Override
    public IDepartmentOperation createDepartmentOperation() {
        return new OracleDepartOper();
    }
}
