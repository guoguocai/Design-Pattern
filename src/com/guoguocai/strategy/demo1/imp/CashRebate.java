package com.guoguocai.strategy.demo1.imp;

import com.guoguocai.strategy.demo1.abs.CashSuper;

/**
 * 打折收费子类
 *
 * @auther guoguocai
 * @date 2019/1/12 16:28
 */
public class CashRebate extends CashSuper {

    private double moneyRebate;

    /**
     * 初始化时需要输入折扣率，如八折，就是 0.8。
     * @param moneyRebate
     */
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }


    public double getMoneyRebate() {
        return moneyRebate;
    }

    public void setMoneyRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }
}
