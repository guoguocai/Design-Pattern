package com.guoguocai.visitor.demo.actionimp;

import com.guoguocai.visitor.demo.abs.Action;
import com.guoguocai.visitor.demo.personimp.Man;
import com.guoguocai.visitor.demo.personimp.Woman;

/**
 * 成功
 *
 * @auther guoguocai
 * @date 2019/1/19 20:01
 */
public class Success extends Action{

    @Override
    public void getManConclusion(Man concreteElementA) {
        System.out.println(concreteElementA.getClass().getSimpleName() + " "
                + this.getClass().getSimpleName() + "时，背后多半有一个伟大的女人。");
    }

    @Override
    public void getWomanConclusion(Woman concreteElementB) {
        System.out.println(concreteElementB.getClass().getSimpleName() + " "
                + this.getClass().getSimpleName() + "时，背后多半有一个不成功的男人。");
    }
}
