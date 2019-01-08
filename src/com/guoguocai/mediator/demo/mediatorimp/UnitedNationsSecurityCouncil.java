package com.guoguocai.mediator.demo.mediatorimp;

import com.guoguocai.mediator.demo.abs.Country;
import com.guoguocai.mediator.demo.abs.UnitedNations;
import com.guoguocai.mediator.demo.colleagueimp.Iraq;
import com.guoguocai.mediator.demo.colleagueimp.USA;

/**
 * 联合国安全理事会
 *
 * @auther guoguocai
 * @date 2019/1/8 23:08
 */
public class UnitedNationsSecurityCouncil extends UnitedNations{

    private USA colleague1;
    private Iraq colleague2;

    public USA getColleague1() {
        return colleague1;
    }

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public Iraq getColleague2() {
        return colleague2;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }


    /**
     * 实现两个对象间的通信
     * @param message
     * @param colleague
     */
    @Override
    public void declare(String message, Country colleague) {
        if (colleague.equals(colleague1)) {
            colleague2.getMessage(message);
        } else {
            colleague1.getMessage(message);
        }

    }
}
