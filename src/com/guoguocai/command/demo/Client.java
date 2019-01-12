package com.guoguocai.command.demo;

import com.guoguocai.command.demo.abs.Command;
import com.guoguocai.command.demo.bean.Barbecuer;
import com.guoguocai.command.demo.bean.Waiter;
import com.guoguocai.command.demo.imp.BakeChickenWingCommand;
import com.guoguocai.command.demo.imp.BakeMuttonCommand;

/**
 * @auther guoguocai
 * @date 2019/1/13 0:02
 */
public class Client {

    public static void main(String[] args) {
        // 开店前准备
        Barbecuer bar = new Barbecuer();
        Command muttonCommand1 = new BakeMuttonCommand(bar);
        Command muttonCommand2 = new BakeMuttonCommand(bar);
        Command chickenCommand1 = new BakeChickenWingCommand(bar);
        Waiter waiter = new Waiter();

        // 顾客点菜
        waiter.setOrder(muttonCommand1);
        waiter.setOrder(muttonCommand2);
        waiter.setOrder(chickenCommand1);

        // 点菜完毕，通知厨房。
        waiter.notifyKitchen();
    }
}
