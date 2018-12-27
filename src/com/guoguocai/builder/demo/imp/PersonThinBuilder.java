package com.guoguocai.builder.demo.imp;

import com.guoguocai.builder.demo.interfaces.PersonBuilder;

/**
 * 画一个瘦子
 *
 * @auther guoguocai
 * @date 2018/12/27 23:03
 */
public class PersonThinBuilder implements PersonBuilder {

    @Override
    public void buildHead() {
        System.out.println("画好瘦子的头了！");
    }

    @Override
    public void buildBody() {
        System.out.println("画好瘦子的身体了！");
    }

    @Override
    public void buildArmLeft() {
        System.out.println("画好瘦子的左手了！");
    }

    @Override
    public void buildArmRight() {
        System.out.println("画好瘦子的右手了！");
    }

    @Override
    public void buildLegLeft() {
        System.out.println("画好瘦子的左脚了！");
    }

    @Override
    public void buildLegRight() {
        System.out.println("画好瘦子的右脚了！");
    }
}
