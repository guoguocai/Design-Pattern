package com.guoguocai.visitor.demo.abs;

/**
 * "人"抽象类
 *
 * @auther guoguocai
 * @date 2019/1/19 19:59
 */
public abstract class Person {

    // 用来获得"状态"对象
    public abstract void accept(Action visitor);
}
