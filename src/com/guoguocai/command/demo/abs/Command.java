package com.guoguocai.command.demo.abs;

import com.guoguocai.command.demo.bean.Barbecuer;

/**
 * 抽象命令类
 *
 * @auther guoguocai
 * @date 2019/1/12 20:58
 */
public abstract class Command {

    protected Barbecuer barbecuer;

    public Command(Barbecuer barbecuer) {
        this.barbecuer = barbecuer;
    }

    //执行命令
    public abstract void executeCommand();
}
