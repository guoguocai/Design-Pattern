package com.guoguocai.mediator.demo.abs;

/**
 * 国家抽象类
 *
 * @auther guoguocai
 * @date 2019/1/8 22:51
 */
public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }
}
