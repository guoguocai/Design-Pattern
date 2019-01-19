package com.guoguocai.observer.demo1.bean;

import java.util.ArrayList;
import java.util.List;

/**
 * 前台秘书类
 *
 * @auther guoguocai
 * @date 2019/1/19 14:20
 */
public class Secretary {

    // 同事列表
    private List<StockObserver> observers = new ArrayList<StockObserver>();
    // 前台通过电话告诉请她帮忙的同事的一些话或所做的事
    private String action;

    // 增加（有几个同事请前台帮忙，就给集合增加几个对象。）
    public void attach(StockObserver stockObserver) {
        observers.add(stockObserver);
    }

    // 通知(待老板来时，就给所有已登记的同事发通知：“老板来了！”)
    public void notifyPeople() {
        for (StockObserver observer:
             observers) {
            observer.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
