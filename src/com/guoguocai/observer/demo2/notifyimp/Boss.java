package com.guoguocai.observer.demo2.notifyimp;

import com.guoguocai.observer.demo2.abs.Observer;
import com.guoguocai.observer.demo2.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 老板
 *
 * @auther guoguocai
 * @date 2019/1/18 23:40
 */
public class Boss implements Subject{

    // 同事列表
    private List<Observer> observers = new ArrayList<Observer>();
    private String action;

    //增加
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    //减少
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    //通知
    @Override
    public void notifyPeople() {
        for (Observer ob:
             observers) {
            ob.update();
        }
    }


    // 老板状态
    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String getAction() {
        return this.action;
    }
}
