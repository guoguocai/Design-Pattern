package com.guoguocai.factorymethod.demo.imp;

import com.guoguocai.factorymethod.demo.interfaces.IOperation;

/**
 * 乘法类
 *
 * @auther guoguocai
 * @date 2018/12/13 22:16
 */
public class OperationMul extends IOperation {

    @Override
    public double getResult() {
        double operResult = getNumberA() * getNumberB();
        return operResult;
    }
}
