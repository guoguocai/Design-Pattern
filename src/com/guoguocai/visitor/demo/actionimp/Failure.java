package com.guoguocai.visitor.demo.actionimp;

import com.guoguocai.visitor.demo.abs.Action;
import com.guoguocai.visitor.demo.personimp.Man;
import com.guoguocai.visitor.demo.personimp.Woman;

/**
 * @auther guoguocai
 * @date 2019/1/19 20:14
 */
public class Failure extends Action {

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " "
                + this.getClass().getSimpleName() + "时，闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + " "
                + this.getClass().getSimpleName() + "时，眼泪汪汪，谁也劝不了。");
    }
}
