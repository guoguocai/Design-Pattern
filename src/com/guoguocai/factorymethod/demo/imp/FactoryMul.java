package com.guoguocai.factorymethod.demo.imp;

import com.guoguocai.factorymethod.demo.interfaces.IFactory;
import com.guoguocai.factorymethod.demo.interfaces.IOperation;

/**
 * 乘法工厂
 *
 * @auther guoguocai
 * @date 2018/12/13 22:35
 */
public class FactoryMul implements IFactory {

    @Override
    public IOperation createOperation() {
        return new OperationMul();
    }
}
