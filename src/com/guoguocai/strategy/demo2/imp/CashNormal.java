package com.guoguocai.strategy.demo2.imp;

import com.guoguocai.strategy.demo2.abs.CashSuper;

/**
 * 正常收费子类
 * 商场没有任何活动，所以花了多少就给多少。
 *
 * @auther guoguocai
 * @date 2019/1/12 16:26
 */
public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        return money;
    }
}
