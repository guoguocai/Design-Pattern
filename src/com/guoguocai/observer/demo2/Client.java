package com.guoguocai.observer.demo2;

import com.guoguocai.observer.demo2.notifyimp.Boss;
import com.guoguocai.observer.demo2.observerimp.NBAObserver;
import com.guoguocai.observer.demo2.observerimp.StockObserver;

/**
 * @auther guoguocai
 * @date 2019/1/18 23:57
 */
public class Client {

    public static void main(String[] args) {

        // 老板胡汉三
        Boss boss = new Boss();
        // 看股票的同事
        StockObserver stock = new StockObserver("小微", boss);
        // 看 NBA 的同事
        NBAObserver nba = new NBAObserver("小易", boss);

        boss.attach(stock);
        boss.attach(nba);

        // 小微没有被通知到，被逮个正着，因此减去。
        boss.detach(stock);

        // 老板回来
        boss.setAction("老板我胡汉三回来了");
        // 通知大家
        boss.notifyPeople();
    }
}
