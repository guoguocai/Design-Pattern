package com.guoguocai.decorator.demo.decorator;

import com.guoguocai.decorator.demo.component.Person;

/**
 * 装饰类(核心)
 *
 * 是为已有功能动态地添加更多功能的一种方式。
 * 能有效地将类的核心职责和装饰功能区分开。
 *
 * @auther guoguocai
 * @date 2018/12/25 22:08
 */
public class Finery extends Person {

    protected Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (component != null) {
            component.show();
        }
    }
}
