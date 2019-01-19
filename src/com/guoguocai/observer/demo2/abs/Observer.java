package com.guoguocai.observer.demo2.abs;

import com.guoguocai.observer.demo2.interfaces.Subject;

/**
 * 抽象观察者
 *
 * @auther guoguocai
 * @date 2019/1/18 23:25
 */
public abstract class Observer {

    protected String name;
    protected Subject sub;

    /**
     * Subject 对应的具体的通知者类可能是前台，也可能是老板。
     * 它们也许有各自的一些方法，但对于通知者来说，它们是一样
     * 的。
     *
     * @param name
     * @param sub
     */
    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
