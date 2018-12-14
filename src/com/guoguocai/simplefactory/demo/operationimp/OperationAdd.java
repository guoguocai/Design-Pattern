package com.guoguocai.simplefactory.demo.operationimp;

import com.guoguocai.simplefactory.demo.interfaces.Operation;

/**
 * 加法类
 * @auther guoguocai
 * @date 2018/12/10 21:57
 */
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        double operResult = getNumberA() + getNumberB();
        return operResult;
    }
}
