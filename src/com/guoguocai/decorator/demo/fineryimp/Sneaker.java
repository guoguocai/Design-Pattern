package com.guoguocai.decorator.demo.fineryimp;

import com.guoguocai.decorator.demo.decorator.Finery;

/**
 * @auther guoguocai
 * @date 2018/12/25 22:30
 */
public class Sneaker extends Finery {

    @Override
    public void show() {
        System.out.println("穿上破球鞋");
        super.show();
    }
}
