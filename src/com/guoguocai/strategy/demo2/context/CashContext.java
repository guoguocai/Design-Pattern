package com.guoguocai.strategy.demo2.context;

import com.guoguocai.strategy.demo2.abs.CashSuper;
import com.guoguocai.strategy.demo2.imp.CashNormal;
import com.guoguocai.strategy.demo2.imp.CashRebate;
import com.guoguocai.strategy.demo2.imp.CashReturn;

/**
 * 引用策略
 *
 * @auther guoguocai
 * @date 2019/1/12 16:51
 */
public class CashContext {

    private CashSuper csuper;

    /**
     * 跟 Demo1 相比，注意参数不再是具体的收费策略 CashSuper cashSuper。
     *
     * 此处应用了简单工厂，将实例化具体策略的过程由客户端转移到了此处。
     * 然而当有新的策略加入时，我们依然要修改此类，应用简单工厂的同时
     * 也带来了它的缺点。
     *
     * 通过前面的学习可知，用反射是目前所知最好的方式。（自己找吧~）
     * @param type
     */
    public CashContext(String type) {

        switch (type){
            case "正常收费":
                CashNormal cnormal = new CashNormal();
                csuper = cnormal;
                break;
            case "满400返100":
                CashReturn creturn = new CashReturn(400, 100);
                csuper = creturn;
                break;
            case "打8折":
                CashRebate crebate = new CashRebate(0.8);
                csuper = crebate;
                break;
        }

    }

    public double getResult(double money) {
        return csuper.acceptCash(money);
    }

}
