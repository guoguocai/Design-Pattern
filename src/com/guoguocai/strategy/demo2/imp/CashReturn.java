package com.guoguocai.strategy.demo2.imp;

import com.guoguocai.strategy.demo2.abs.CashSuper;

/**
 * 返利收费子类
 * 比如满 300 返 100
 *
 * @auther guoguocai
 * @date 2019/1/12 16:34
 */
public class CashReturn extends CashSuper{

    private double moneyCondition;
    private double moneyReturn;

    /**
     * 初始化时需输入返利条件和返利值，比如满 300 返 100，
     * 则 moneyCondition 为 300， moneyReturn 为 100。
     * @param moneyCondition
     * @param moneyReturn
     */
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    /**
     * 若大于返利条件，则减去返利值。
     * @param money
     * @return
     */
    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - (money / moneyCondition) * moneyReturn;
        }
        return result;
    }


    public double getMoneyCondition() {
        return moneyCondition;
    }

    public void setMoneyCondition(double moneyCondition) {
        this.moneyCondition = moneyCondition;
    }

    public double getMoneyReturn() {
        return moneyReturn;
    }

    public void setMoneyReturn(double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }
}
