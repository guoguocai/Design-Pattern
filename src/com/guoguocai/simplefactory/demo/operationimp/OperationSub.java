package com.guoguocai.simplefactory.demo.operationimp;

import com.guoguocai.simplefactory.demo.interfaces.Operation;

/**
 * 减法类
 * @auther guoguocai
 * @date 2018/12/10 22:00
 */
public class OperationSub extends Operation {

    @Override
    public double getResult() {
        double operResult = getNumberA() - getNumberB();
        return operResult;
    }
}
