package com.guoguocai.agent.demo1.imp;

import com.guoguocai.agent.demo1.bean.BeautifulGirl;
import com.guoguocai.agent.demo1.interfaces.IGiveGift;

/**
 * 追求者类
 *
 * @auther guoguocai
 * @date 2019/1/7 22:50
 */
public class Pursuit implements IGiveGift {

    BeautifulGirl beautifulGirl;

    public Pursuit(BeautifulGirl mm) {
        this.beautifulGirl = mm;
    }

    @Override
    public void giveDolls() {
        System.out.println("送给 " + beautifulGirl.getName() + " 洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println("送给 " + beautifulGirl.getName() + " 鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println("送给 " + beautifulGirl.getName() + " 巧克力");
    }
}
