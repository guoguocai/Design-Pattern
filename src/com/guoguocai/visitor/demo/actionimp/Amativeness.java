package com.guoguocai.visitor.demo.actionimp;

import com.guoguocai.visitor.demo.abs.Action;
import com.guoguocai.visitor.demo.personimp.Man;
import com.guoguocai.visitor.demo.personimp.Woman;

/**
 * @auther guoguocai
 * @date 2019/1/19 20:16
 */
public class Amativeness extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " "
                + this.getClass().getSimpleName() + "时，凡事不懂也要装懂。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + " "
                + this.getClass().getSimpleName() + "时，遇事懂也装作不懂。");
    }
}
