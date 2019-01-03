package com.guoguocai.adapter.demo.adapter;

import com.guoguocai.adapter.demo.abs.Player;
import com.guoguocai.adapter.demo.adaptee.ForeignCenter;

/**
 * 翻译者
 *
 * 就相当于一个适配器，在中间做一个转换。
 *
 * @auther guoguocai
 * @date 2019/1/3 23:09
 */
public class Translator extends Player{

    private ForeignCenter foreignCenter = new ForeignCenter();

    public Translator(String name) {
        super(name);
        foreignCenter.setName(name);
    }

    // 翻译者将 Attack 翻译为 “进攻” 后再告诉给外籍中锋
    @Override
    public void Attack() {
        foreignCenter.进攻();
    }

    // 翻译者将 Defense 翻译为 “防守” 后再告诉给外籍中锋
    @Override
    public void Defense() {
        foreignCenter.防守();
    }
}
