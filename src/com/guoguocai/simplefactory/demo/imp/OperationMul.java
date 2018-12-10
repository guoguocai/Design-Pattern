package com.guoguocai.simplefactory.demo.imp;

import com.guoguocai.simplefactory.demo.interfaces.Operation;

/**
 * 乘法类
 * @auther guoguocai
 * @date 2018/12/10 22:02
 */
public class OperationMul extends Operation {

    @Override
    public double getResult() {
        double operResult = getNumberA() * getNumberB();
        return operResult;
    }
}
