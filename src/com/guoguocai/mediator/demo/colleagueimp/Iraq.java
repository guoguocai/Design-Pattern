package com.guoguocai.mediator.demo.colleagueimp;

import com.guoguocai.mediator.demo.abs.Country;
import com.guoguocai.mediator.demo.abs.UnitedNations;

/**
 * 伊拉克
 *
 * @auther guoguocai
 * @date 2019/1/8 23:06
 */
public class Iraq extends Country {

    public Iraq(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    // 获得消息
    public void getMessage(String message) {
        System.out.println("伊拉克获得对方消息：" + message);
    }
}
