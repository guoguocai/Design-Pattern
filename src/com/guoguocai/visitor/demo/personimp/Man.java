package com.guoguocai.visitor.demo.personimp;

import com.guoguocai.visitor.demo.abs.Action;
import com.guoguocai.visitor.demo.abs.Person;

/**
 * 男人
 *
 * @auther guoguocai
 * @date 2019/1/19 20:02
 */
public class Man extends Person {

    /**
     * 双分派：
     * 首先在客户程序中将具体状态作为参数传递给“男人”类完成了一次分派，
     * 然后“男人”类调用作为参数的“具体状态”中的方法“男人反应”（accept），
     * 同时将自己（this）作为参数传递进去。这就完成了第二次分派。
     * @param visitor
     */
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }
}
