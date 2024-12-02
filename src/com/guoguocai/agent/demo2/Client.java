package com.guoguocai.agent.demo2;

import com.guoguocai.agent.demo2.dynamic.GeneralProxy;
import com.guoguocai.agent.demo2.external.Tank;
import com.guoguocai.agent.demo2.imp.LogHandler;
import com.guoguocai.agent.demo2.imp.TankProxyLog;
import com.guoguocai.agent.demo2.imp.TankProxyTime;
import com.guoguocai.agent.demo2.imp.TimeHandler;
import com.guoguocai.agent.demo2.interfaces.Moveable;

public class Client {

    public static void main(String[] args) {
        /**
         * 注意是用父类接口 Moveable 接收，而不是具体实现类，每个代理类的构造
         * 方法也做同样处理，就能实现灵活调整代理类之间的顺序。
         */
        System.out.println("========= Static Proxy : =========");
        Moveable tank = new Tank();
        Moveable proxy1 = new TankProxyTime(tank);
        Moveable proxy2 = new TankProxyLog(proxy1);
        proxy2.move();

        /**
         * TankProxyTime 和 TankProxyLog 两个代理类都是要在编译代码之前写好，
         * 然后在编译期间生成，属于静态代理。此时已经具备了一定的扩展性，如果后
         * 续还需要增加其他处理，那就创建新的代理类并实现同一个接口就好。
         *
         * 不过这依然不够灵活，因为我们仅仅只针对了 Moveable 这一个接口，如果
         * 还需要对其他接口的对象进行代理，那么在 Moveable 接口上写好的代理类，
         * 很有可能需要换个接口再写一遍，导致代理类的数量也会无限增长下去。所以
         * 我们希望代理类的实现最好能够对任意接口、和任意接口的方法复用，此时就
         * 要用到动态代理，让代理类在程序运行期才生成。
         */
        System.out.println();
        System.out.println("========= Dynamic Proxy : =========");
        Moveable tank2 = new Tank();
        Moveable proxyInstance1 = (Moveable) GeneralProxy.newProxyInstance(Moveable.class, new LogHandler(tank2));
        Moveable proxyInstance2 = (Moveable) GeneralProxy.newProxyInstance(Moveable.class, new TimeHandler(proxyInstance1));
        proxyInstance2.move();

    }
}
