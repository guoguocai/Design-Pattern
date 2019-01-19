package com.guoguocai.observer.demo3.notifyimp;

import com.guoguocai.observer.demo3.interfaces.Subject;

/**
 * 前台秘书类
 *
 * @auther guoguocai
 * @date 2019/1/19 16:18
 */
public class Secretary extends Subject {

    @Override
    public void addListener(Object object, String methodName, Object...args) {
        this.getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void Notify() {
        try {
            this.getEventHandler().Notify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
