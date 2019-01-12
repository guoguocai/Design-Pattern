package com.guoguocai.command.demo.bean;

import com.guoguocai.command.demo.abs.Command;
import com.guoguocai.command.demo.imp.BakeChickenWingCommand;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 服务员
 *
 * @auther guoguocai
 * @date 2019/1/12 22:16
 */
public class Waiter {

    // 存放具体命令
    private List<Command> orders = new ArrayList<Command>();

    // 设置订单
    public void setOrder(Command command) {
        String bakeName = command.getClass().getSimpleName();
        // 没有货的时候要回绝
        if ("BakeChickenWingCommand".equals(bakeName)) {
            System.out.println("服务员说：鸡翅没有了，请点别的烧烤。");
        } else {
            orders.add(command);
            // 记录客户所点烧烤，以备算账收钱。
            System.out.println("增加了一份订单: " + bakeName + " 时间： " + new Date());
        }
    }


    // 取消订单
    public void cancelOrder(Command command) {
        String bakeName = command.getClass().getSimpleName();
        orders.remove(command);
        System.out.println("取消了一份订单: " + bakeName + " 时间： " + new Date());
    }


    // 根据用户订单通知厨房制作
    public void notifyKitchen() {
        System.out.println("通知厨房制作：");
        for (Command comd:
             orders) {
            comd.executeCommand();
        }
    }
}
