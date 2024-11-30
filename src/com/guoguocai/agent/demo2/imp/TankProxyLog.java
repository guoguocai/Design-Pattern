package com.guoguocai.agent.demo2.imp;

import com.guoguocai.agent.demo2.interfaces.Moveable;

// 代理类需实现同一个接口
public class TankProxyLog implements Moveable {

    // 被代理的对象用父类接口声明
    Moveable tank;

    public TankProxyLog(Moveable tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("Tank move log open [");
        tank.move();
        System.out.println("Tank move log close ]");
    }
}
