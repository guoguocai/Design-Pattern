package com.guoguocai.adapter.demo.imp;

import com.guoguocai.adapter.demo.abs.Player;

/**
 * 后卫
 *
 * @auther guoguocai
 * @date 2019/1/3 22:58
 */
public class Guards extends Player {

    public Guards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println("后卫 " + name + " 进攻");
    }

    @Override
    public void Defense() {
        System.out.println("后卫 " + name + " 防守");
    }
}
