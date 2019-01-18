package com.guoguocai.observer.demo1.observerimp;

import com.guoguocai.observer.demo1.bean.Observer;
import com.guoguocai.observer.demo1.interfaces.Subject;

/**
 * 看 NBA 的同事
 *
 * @auther guoguocai
 * @date 2019/1/18 23:55
 */
public class NBAObserver extends Observer {

    /**
     * Subject 对应的具体的通知者类可能是前台，也可能是老板。
     * 它们也许有各自的一些方法，但对于通知者来说，它们是一样
     * 的。
     *
     * @param name
     * @param sub
     */
    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(sub.getAction() + ", " + name + "关闭 NBA 直播，继续工作！");
    }
}
