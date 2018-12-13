package com.guoguocai.factorymethod.demo.interfaces;

/**
 * 计算器的操作父类，具体的运算将继承这个类。
 * 这里主要以加、减、乘、除为例（以后可能加
 * 平方、平方根等运算）。
 *
 * @auther guoguocai
 * @date 2018/12/13 22:10
 */
public class IOperation {

    private double numberA;
    private double numberB;

    /* 这个方法供子类重写，因为不同的运算过程是不一样的。 */
    public double getResult() {
        double result = 0;
        return result;
    }

    public IOperation() {
    }

    public IOperation(double numberA, double numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
