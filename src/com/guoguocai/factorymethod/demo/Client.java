package com.guoguocai.factorymethod.demo;

import com.guoguocai.factorymethod.demo.imp.FactoryAdd;
import com.guoguocai.factorymethod.demo.interfaces.IFactory;
import com.guoguocai.factorymethod.demo.interfaces.IOperation;

/**
 * 客户端,需要决定具体应该实例化哪一个子类，
 * 与简单工厂相比，分支判断的问题只是由工厂
 * 类转移到了客户端，判断的问题依然存在。
 *
 * @auther guoguocai
 * @date 2018/12/13 22:37
 */
public class Client {

    public static void main(String[] args) {
        /* 加法工厂可以被其他工厂替换 */
        IFactory operFactory = new FactoryAdd();
        IOperation oper = operFactory.createOperation();
        oper.setNumberA(20);
        oper.setNumberB(30);
        double result = oper.getResult();
        System.out.println("result: " + result);
    }
}
