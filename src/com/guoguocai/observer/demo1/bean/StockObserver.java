package com.guoguocai.observer.demo1.bean;

/**
 * 看股票同事类
 *
 * @auther guoguocai
 * @date 2019/1/19 14:23
 */
public class StockObserver {

    private String name;
    private Secretary secretary;

    public StockObserver(String name, Secretary sec) {
        this.name = name;
        this.secretary = sec;
    }

    // 得到前台的通知，赶紧采取行动。
    public void update() {
        System.out.println(secretary.getAction() + ", " + name + "关闭股票行情，继续工作！");
    }
}
