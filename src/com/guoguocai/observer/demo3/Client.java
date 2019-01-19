package com.guoguocai.observer.demo3;

import com.guoguocai.observer.demo3.notifyimp.Boss;
import com.guoguocai.observer.demo3.observer.NBAObserver;
import com.guoguocai.observer.demo3.observer.StockObserver;

/**
 * 事件委托实现
 *
 * @auther guoguocai
 * @date 2019/1/19 16:20
 */
public class Client {

    public static void main(String[] args)
    {

        //老板胡汉三
        Boss huhansan = new Boss();

        //看股票的同事
        StockObserver tongshi1 = new StockObserver("魏关姹", huhansan);
        //看NBA的同事
        NBAObserver tongshi2 = new NBAObserver("恩必", huhansan);

        /**
         * 将两个完全不同的方法都挂到通知者的同一方法下
         */
        huhansan.addListener(tongshi1, "closeStockMarket");
        huhansan.addListener(tongshi2, "closeNBADirectSeeding");

        //老板回来
        huhansan.setAction("我胡汉三回来了！");
        //发出通知
        huhansan.Notify();

    }

}
