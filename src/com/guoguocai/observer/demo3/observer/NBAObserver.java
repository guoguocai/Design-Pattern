package com.guoguocai.observer.demo3.observer;

import com.guoguocai.observer.demo3.interfaces.Subject;

/**
 * 看 NBA 的同事
 *
 * @auther guoguocai
 * @date 2019/1/19 15:40
 */
public class NBAObserver {

    private String name;
    private Subject sub;

    public NBAObserver(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    // 去掉了父类“抽象观察类”，所以此处的方法名也改变了。
    public void closeNBADirectSeeding() {
        System.out.println(sub.getAction() + ", " + name + "关闭 NBA 直播，继续工作！");
    }
}
