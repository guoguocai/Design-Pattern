package com.guoguocai.command.demo.imp;

import com.guoguocai.command.demo.abs.Command;
import com.guoguocai.command.demo.bean.Barbecuer;

/**
 * 烤鸡翅命令
 *
 * @auther guoguocai
 * @date 2019/1/12 21:11
 */
public class BakeChickenWingCommand extends Command{

    public BakeChickenWingCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeChickenWing();
    }
}
