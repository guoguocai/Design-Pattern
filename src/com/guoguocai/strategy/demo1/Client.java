package com.guoguocai.strategy.demo1;

import com.guoguocai.strategy.demo1.context.CashContext;
import com.guoguocai.strategy.demo1.imp.CashNormal;
import com.guoguocai.strategy.demo1.imp.CashRebate;
import com.guoguocai.strategy.demo1.imp.CashReturn;

/**
 * Demo1 的问题就在于客户端要进行判断，为了改进
 * 这个问题，Demo2 配合使用了简单工厂，将判断的
 * 逻辑转移到了 Context 类中。
 *
 * 从这点也可以看出，应用简单工厂的时候并不是非
 * 得新建出一个单独的类才行。
 *
 * @auther guoguocai
 * @date 2019/1/12 16:55
 */
public class Client {

    /**
     * 通过下拉选择框传入相应的策略。
     * @param str
     */
    private double clickBtn(String str, double costMoney) {
        CashContext cc = null;
        switch (str){
            case "正常收费":
                cc = new CashContext(new CashNormal());
                break;
            case "满400返100":
                cc = new CashContext(new CashReturn(400, 100));
                break;
            case "打8折":
                cc = new CashContext(new CashRebate(0.8));
                break;
        }

        return cc.getResult(costMoney);
    }

    public static void main(String[] args) {

        double total = new Client().clickBtn("正常收费", 600);
        System.out.println("最后应收费：" + total + "元");

        double total1 = new Client().clickBtn("满400返100", 600);
        System.out.println("最后应收费：" + total1 + "元");

        double total2 = new Client().clickBtn("打8折", 600);
        System.out.println("最后应收费：" + total2 + "元");
    }
}
