package com.guoguocai.factorymethod.demo.imp;

import com.guoguocai.factorymethod.demo.interfaces.IOperation;

/**
 * 加法类
 *
 * @auther guoguocai
 * @date 2018/12/13 22:12
 */
public class OperationAdd extends IOperation {

    @Override
    public double getResult() {
        double operResult = getNumberA() + getNumberB();
        return operResult;
    }
}
