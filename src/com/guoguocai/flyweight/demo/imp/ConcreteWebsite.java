package com.guoguocai.flyweight.demo.imp;

import com.guoguocai.flyweight.demo.abs.Website;
import com.guoguocai.flyweight.demo.bean.User;

/**
 * 具体网站类
 *
 * @auther guoguocai
 * @date 2019/1/13 13:56
 */
public class ConcreteWebsite extends Website {

    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    //  User 属于外部状态，所以通过参数传进来。
    @Override
    public void use(User user) {
        System.out.println("网站分类：" + name + " 用户：" + user.getName());
    }
}
