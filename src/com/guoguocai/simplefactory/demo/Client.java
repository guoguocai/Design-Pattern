package com.guoguocai.simplefactory.demo;

import com.guoguocai.simplefactory.demo.factory.OperationFactory;
import com.guoguocai.simplefactory.demo.interfaces.Operation;

/**
 * 客户端，可根据需要灵活传参。
 *
 * 以计算器的加、减、乘、除为例，演示简单工厂模式。
 *
 * @auther guoguocai
 * @date 2018/12/10 22:16
 */
public class Client {

    public static void main(String[] args) {
        Operation oper;
        oper = OperationFactory.getOperation("+");
        oper.setNumberA(10);
        oper.setNumberB(10);
        System.out.println("结果为: " + oper.getResult());
    }
}
