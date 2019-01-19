package com.guoguocai.observer.demo2.notifyimp;

import com.guoguocai.observer.demo2.abs.Observer;
import com.guoguocai.observer.demo2.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 前台秘书类
 *
 * @auther guoguocai
 * @date 2019/1/18 23:50
 */
public class Secretary implements Subject {

    // 同事列表
    private List<Observer> observers = new ArrayList<Observer>();
    private String action;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyPeople() {
        for (Observer ob:
                observers) {
            ob.update();
        }
    }


    // 前台秘书状态
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return null;
    }
}
