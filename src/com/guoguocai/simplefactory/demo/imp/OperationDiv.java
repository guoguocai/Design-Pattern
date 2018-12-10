package com.guoguocai.simplefactory.demo.imp;

import com.guoguocai.simplefactory.demo.interfaces.Operation;

/**
 * 除法类
 * @auther guoguocai
 * @date 2018/12/10 22:03
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getNumberB() == 0) {
            System.out.println("除数不能为0！");
            return 0;
        }
        double operResult = getNumberA() / getNumberB();
        return operResult;
    }
}
