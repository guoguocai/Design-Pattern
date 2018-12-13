package com.guoguocai.factorymethod.demo.imp;

import com.guoguocai.factorymethod.demo.interfaces.IOperation;

/**
 * 除法类
 *
 * @auther guoguocai
 * @date 2018/12/13 22:13
 */
public class OperationDiv extends IOperation {

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
