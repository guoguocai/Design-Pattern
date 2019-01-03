package com.guoguocai.adapter.demo.imp;

import com.guoguocai.adapter.demo.abs.Player;

/**
 * 前锋
 *
 * @auther guoguocai
 * @date 2019/1/3 22:51
 */
public class Forwards extends Player {

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("前锋 " + name + " 进攻");

    }

    @Override
    public void Defense() {
        System.out.println("前锋 " + name + " 防守");
    }
}
