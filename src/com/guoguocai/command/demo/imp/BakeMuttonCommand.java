package com.guoguocai.command.demo.imp;

import com.guoguocai.command.demo.abs.Command;
import com.guoguocai.command.demo.bean.Barbecuer;

/**
 * 烤羊肉串命令
 *
 * @auther guoguocai
 * @date 2019/1/12 21:05
 */
public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer barbecuer) {
        super(barbecuer);
    }

    @Override
    public void executeCommand() {
        barbecuer.bakeMutton();
    }
}
