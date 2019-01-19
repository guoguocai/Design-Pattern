package com.guoguocai.observer.demo3.notifyimp;

import com.guoguocai.observer.demo3.interfaces.Subject;

/**
 * 老板类
 *
 * @auther guoguocai
 * @date 2019/1/19 16:03
 */
public class Boss extends Subject{


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
