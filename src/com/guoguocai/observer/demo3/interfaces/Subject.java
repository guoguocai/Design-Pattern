package com.guoguocai.observer.demo3.interfaces;

import com.guoguocai.observer.demo3.event.EventHandler;

/**
 * 通知者抽象类
 *
 * @auther guoguocai
 * @date 2019/1/19 15:19
 */
public abstract class Subject{

    //通知者状态
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    private EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object,String methodName, Object[] args);

    public abstract void Notify();

}
