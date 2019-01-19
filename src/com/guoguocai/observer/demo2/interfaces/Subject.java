package com.guoguocai.observer.demo2.interfaces;

import com.guoguocai.observer.demo2.abs.Observer;

/**
 * 通知者接口
 * 具体的通知者可能是前台，也可能是老板。
 *
 * @auther guoguocai
 * @date 2019/1/18 23:24
 */
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);
    void notifyPeople();
    String getAction();

}
