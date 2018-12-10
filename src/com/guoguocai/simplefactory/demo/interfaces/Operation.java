package com.guoguocai.simplefactory.demo.interfaces;

/**
 * 计算器的操作父类，具体的运算将继承这个类。
 * 这里主要以加、减、乘、除为例（以后可能加
 * 平方、平方根等运算）。
 *
 * 这样的做法实现了业务逻辑和界面的分离，如果
 * 以后有新的运算要加进来，添加子类即可，不会
 * 影响到原来已有的运算类。
 *
 * @auther guoguocai
 * @date 2018/12/10 21:47
 */
public class Operation {

    private double numberA;
    private double numberB;

    /* 这个方法供子类重写，因为不同的运算过程是不一样的。 */
    public double getResult() {
        double result = 0;
        return result;
    }

    public Operation() {
    }

    public Operation(double numberA, double numberB) {
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
