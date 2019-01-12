package com.guoguocai.strategy.demo1.context;

import com.guoguocai.strategy.demo1.abs.CashSuper;

/**
 * 引用策略
 *
 * @auther guoguocai
 * @date 2019/1/12 16:51
 */
public class CashContext {

    private CashSuper cs;

    /**
     * 通过构造方法传入具体的收费策略
     * @param cashSuper
     */
    public CashContext(CashSuper cashSuper) {
        this.cs = cashSuper;
    }

    public double getResult(double money) {
        return cs.acceptCash(money);
    }

}
