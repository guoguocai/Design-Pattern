package com.guoguocai.observer.demo1;

import com.guoguocai.observer.demo1.bean.Secretary;
import com.guoguocai.observer.demo1.bean.StockObserver;

/**
 * Demo1 的两个类相互耦合，不符合设计原则。
 * 而且同事中的这些观察者不可能都是看股票的，
 * 也可能有看 NBA 的。
 *
 * 除此以外，其实老板也是属于通知者的。没被
 * 前台通知到的就会被老板通知......
 *
 * @auther guoguocai
 * @date 2019/1/19 14:22
 */
public class Client {

    public static void main(String[] args) {

        // 前台小姐童之哲
        Secretary secretary = new Secretary();

        // 看股票的同事
        StockObserver stock1 = new StockObserver("阚古票", secretary);
        StockObserver stock2 = new StockObserver("乔谷漂", secretary);

        // 两位看股票的同事请前台帮忙注意老板的动向
        secretary.attach(stock1);
        secretary.attach(stock2);

        // 前台发现老板回来
        secretary.setAction("老板回来了！");

        // 通知两位同事
        secretary.notifyPeople();
    }
}
