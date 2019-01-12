package com.guoguocai.strategy.demo2;

import com.guoguocai.strategy.demo2.context.CashContext;

/**
 * Demo2 的逻辑判断已经移到了 Context 类中。
 *
 * @auther guoguocai
 * @date 2019/1/12 17:53
 */
public class Client {

    public static void main(String[] args) {
        CashContext con1 = new CashContext("正常收费");
        System.out.println("应收费：" + con1.getResult(600));

        CashContext con2 = new CashContext("满400返100");
        System.out.println("应收费：" + con2.getResult(600));

        CashContext con3 = new CashContext("打8折");
        System.out.println("应收费：" + con3.getResult(600));
    }

}
