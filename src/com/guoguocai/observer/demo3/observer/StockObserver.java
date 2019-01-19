package com.guoguocai.observer.demo3.observer;

import com.guoguocai.observer.demo3.interfaces.Subject;

/**
 * 看股票的同事
 *
 * @auther guoguocai
 * @date 2019/1/19 15:19
 */
public class StockObserver {

    private String name;
    private Subject sub;

    public StockObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    // 去掉了父类“抽象观察类”，所以此处的方法名也改变了。
    public void closeStockMarket() {
        System.out.println(sub.getAction() + ", " + name + "关闭股票行情，继续工作！");
    }
}
