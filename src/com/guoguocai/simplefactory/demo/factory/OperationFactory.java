package com.guoguocai.simplefactory.demo.factory;

import com.guoguocai.simplefactory.demo.imp.OperationAdd;
import com.guoguocai.simplefactory.demo.imp.OperationDiv;
import com.guoguocai.simplefactory.demo.imp.OperationMul;
import com.guoguocai.simplefactory.demo.imp.OperationSub;
import com.guoguocai.simplefactory.demo.interfaces.Operation;

/**
 * 简单工厂类，负责根据需要初始化具体的运算子类实例。
 * 此处的分支判断是简单工厂模式的一个缺点，违反开闭原则。
 *
 * @auther guoguocai
 * @date 2018/12/10 22:08
 */
public class OperationFactory {

    public static Operation getOperation(String op) {
        Operation oper = null;

        switch (op) {
            case "+":
                oper = new OperationAdd();
                break;
            case "-":
                oper = new OperationSub();
                break;
            case "*":
                oper = new OperationMul();
                break;
            case "/":
                oper = new OperationDiv();
                break;
        }

        return oper;
    }
}
