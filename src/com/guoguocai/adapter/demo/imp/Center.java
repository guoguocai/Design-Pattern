package com.guoguocai.adapter.demo.imp;

import com.guoguocai.adapter.demo.abs.Player;

/**
 * 中锋
 *
 * @auther guoguocai
 * @date 2019/1/3 22:56
 */
public class Center extends Player{

    public Center(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("中锋 " + name + " 进攻");
    }

    @Override
    public void Defense() {
        System.out.println("中锋 " + name + " 防守");
    }
}
