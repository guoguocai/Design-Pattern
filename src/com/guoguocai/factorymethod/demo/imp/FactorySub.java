package com.guoguocai.factorymethod.demo.imp;

import com.guoguocai.factorymethod.demo.interfaces.IFactory;
import com.guoguocai.factorymethod.demo.interfaces.IOperation;

/**
 * 减法工厂
 *
 * @auther guoguocai
 * @date 2018/12/13 22:36
 */
public class FactorySub implements IFactory {

    @Override
    public IOperation createOperation() {
        return new OperationSub();
    }
}
