package com.guoguocai.factorymethod.demo.imp;

import com.guoguocai.factorymethod.demo.interfaces.IFactory;
import com.guoguocai.factorymethod.demo.interfaces.IOperation;

/**
 * 除法工厂
 *
 * @auther guoguocai
 * @date 2018/12/13 22:34
 */
public class FactoryDiv implements IFactory {

    @Override
    public IOperation createOperation() {
        return new OperationDiv();
    }
}
