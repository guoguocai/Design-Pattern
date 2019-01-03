package com.guoguocai.adapter.demo;

import com.guoguocai.adapter.demo.abs.Player;
import com.guoguocai.adapter.demo.adapter.Translator;
import com.guoguocai.adapter.demo.imp.Forwards;
import com.guoguocai.adapter.demo.imp.Guards;

/**
 * @auther guoguocai
 * @date 2019/1/3 23:14
 */
public class Client {

    public static void main(String[] args) {

        Player b = new Forwards("巴蒂尔");
        b.Attack();

        Player m = new Guards("麦克格雷迪");
        m.Attack();

        // 翻译告诉姚明既要进攻又要防守
        Player ym = new Translator("姚明");
        ym.Attack();
        ym.Defense();
    }
}
