package com.guoguocai.decorator.demo.fineryimp;

import com.guoguocai.decorator.demo.decorator.Finery;

/**
 * @auther guoguocai
 * @date 2018/12/25 22:31
 */
public class LeatherShoe extends Finery {

    @Override
    public void show() {
        System.out.println("穿上皮鞋");
        super.show();
    }
}
