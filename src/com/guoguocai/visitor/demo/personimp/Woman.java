package com.guoguocai.visitor.demo.personimp;

import com.guoguocai.visitor.demo.abs.Action;
import com.guoguocai.visitor.demo.abs.Person;

/**
 * 女人
 *
 * @auther guoguocai
 * @date 2019/1/19 20:04
 */
public class Woman extends Person{

    @Override
    public void accept(Action visitor) {
        visitor.getWomanConclusion(this);
    }
}
