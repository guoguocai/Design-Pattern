package com.guoguocai.builder.demo.interfaces;

/**
 * 用一个抽象类来稳定建造的过程，使得我们
 * 不会忘记其中的任何一个建造步骤。
 *
 * 本例为建造一个小人，每个人的外形特征都
 * 不一样，但是组成部分是一样的，都包含：
 * 头、身体、左手、右手、左脚、右脚。
 *
 * @auther guoguocai
 * @date 2018/12/27 22:59
 */
public interface PersonBuilder {

    public abstract void buildHead();
    public abstract void buildBody();
    public abstract void buildArmLeft();
    public abstract void buildArmRight();
    public abstract void buildLegLeft();
    public abstract void buildLegRight();
}
