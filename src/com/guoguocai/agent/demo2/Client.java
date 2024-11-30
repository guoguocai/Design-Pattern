package com.guoguocai.agent.demo2;

import com.guoguocai.agent.demo2.external.Tank;
import com.guoguocai.agent.demo2.imp.TankProxyLog;
import com.guoguocai.agent.demo2.imp.TankProxyTime;
import com.guoguocai.agent.demo2.interfaces.Moveable;

public class Client {

    public static void main(String[] args) {
        /**
         * 注意是用父类接口 Moveable 接收，而不是具体实现类，
         * 每个代理类的构造方法也是做同样处理，就能实现灵活调整代理类之间的顺序
         */
        Tank tank = new Tank();
        Moveable proxy1 = new TankProxyTime(tank);
        Moveable proxy2 = new TankProxyLog(proxy1);
        proxy2.move();
    }
}
