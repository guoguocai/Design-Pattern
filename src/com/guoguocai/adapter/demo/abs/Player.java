package com.guoguocai.adapter.demo.abs;

/**
 * 球员抽象类
 *
 * @auther guoguocai
 * @date 2019/1/3 22:48
 */
public abstract class Player {

    protected String name;
    public Player(String name) {
        this.name = name;
    }

    public abstract void Attack();//进攻
    public abstract void Defense();//防守
}
