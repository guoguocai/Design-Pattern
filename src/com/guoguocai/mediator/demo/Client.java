package com.guoguocai.mediator.demo;

import com.guoguocai.mediator.demo.colleagueimp.Iraq;
import com.guoguocai.mediator.demo.colleagueimp.USA;
import com.guoguocai.mediator.demo.mediatorimp.UnitedNationsSecurityCouncil;

/**
 * @auther guoguocai
 * @date 2019/1/8 23:12
 */
public class Client {

    public static void main(String[] args) {

        UnitedNationsSecurityCouncil council = new UnitedNationsSecurityCouncil();
        USA usa = new USA(council);
        Iraq iraq = new Iraq(council);

        council.setColleague1(usa);
        council.setColleague2(iraq);

        usa.declare("不准研制核武器，否则将发动战争！");
        iraq.declare("我们没有核武器，也不怕侵略。");
    }
}
