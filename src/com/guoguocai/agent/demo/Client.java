package com.guoguocai.agent.demo;

import com.guoguocai.agent.demo.bean.BeautifulGirl;
import com.guoguocai.agent.demo.imp.Proxy;

/**
 * @auther guoguocai
 * @date 2019/1/7 23:00
 */
public class Client {

    public static void main(String[] args) {

        BeautifulGirl beautifulGirl = new BeautifulGirl();
        beautifulGirl.setName("陈大美女");

        Proxy proxy = new Proxy(beautifulGirl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
