package com.guoguocai.mediator.demo.colleagueimp;

import com.guoguocai.mediator.demo.abs.Country;
import com.guoguocai.mediator.demo.abs.UnitedNations;

/**
 * 美国
 *
 * @auther guoguocai
 * @date 2019/1/8 23:01
 */
public class USA extends Country {

    public USA(UnitedNations mediator) {
        super(mediator);
    }

    public void declare(String message) {
        mediator.declare(message, this);
    }

    // 获得消息
    public void getMessage(String message) {
        System.out.println("美国获得对方消息：" + message);
    }
}
