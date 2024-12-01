package com.guoguocai.agent.demo2.imp;

import com.guoguocai.agent.demo2.interfaces.Moveable;

// 代理类需实现同一个接口
public class TankProxyTime implements Moveable {

    // 这种引用方式就叫做聚合
    // 被代理的对象用父类接口声明
    Moveable tank;

    public TankProxyTime(Moveable tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("Tank move startTime: " + System.currentTimeMillis());
        tank.move();
        System.out.println("Tank move endTime: " + System.currentTimeMillis());
    }
}
