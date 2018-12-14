package com.guoguocai.factorymethod.demo.operationimp;

import com.guoguocai.factorymethod.demo.interfaces.IOperation;

/**
 * 减法类
 *
 * @auther guoguocai
 * @date 2018/12/13 22:18
 */
public class OperationSub extends IOperation {

    @Override
    public double getResult() {
        double operResult = getNumberA() - getNumberB();
        return operResult;
    }
}
