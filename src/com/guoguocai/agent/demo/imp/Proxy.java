package com.guoguocai.agent.demo.imp;

import com.guoguocai.agent.demo.bean.BeautifulGirl;
import com.guoguocai.agent.demo.interfaces.IGiveGift;

/**
 * 代理类
 * 用来控制对追求者类的直接访问
 *
 * @auther guoguocai
 * @date 2019/1/7 22:55
 */
public class Proxy implements IGiveGift {

    Pursuit pursuit;

    public Proxy(BeautifulGirl beautifulGirl) {
        pursuit = new Pursuit(beautifulGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
