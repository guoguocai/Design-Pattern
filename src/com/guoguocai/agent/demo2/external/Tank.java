package com.guoguocai.agent.demo2.external;

import com.guoguocai.agent.demo2.interfaces.Moveable;

import java.util.Random;

public class Tank implements Moveable {

    /**
     * 以这个类为例，实现动态代理的功能。
     * （写代码思路：用聚合而不用继承（代理需求一多，继承的子类将无限增长）
     *            -> 针对一个接口一个方法（接口一多，代理类也将无限增长）
     *            -> 针对任意接口任意方法）
     *
     * 最开始只有这样一个简单的 Tank 类，特别说明，这个类来自于第三方的库，
     * 我们只有它的 .class 文件，无法修改其源码。而且，它必须要实现某一个
     * 接口（其实即使能够修改源码，最好的办法也是定义一个接口来实现）。
     *
     * 现在想要实现这样一个功能：记录 Tank 执行 move() 方法的用时，也就是
     * 需要在执行 move 方法的前后记录时间，这个功能在检测瓶颈或者监控性能的
     * 时候是有用的。在实际应用中，除了在方法执行前后记录时间，还有可能在方法
     * 前后加事务控制、权限验证、日志打印等等，并且相互之间可能是有顺序要求的，
     * 最好能够灵活调整顺序。
     */
    @Override
    public void move() {
        System.out.println("Tank moving......");
        try {
            // 产生一个 10000 以内的随机数
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
