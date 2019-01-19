package com.guoguocai.visitor.demo.abs;

import com.guoguocai.visitor.demo.personimp.Man;
import com.guoguocai.visitor.demo.personimp.Woman;

/**
 * "状态"抽象类
 *
 * @auther guoguocai
 * @date 2019/1/19 19:56
 */
public abstract class Action {

    // 得到男人结论或反应
    public abstract void getManConclusion(Man concreteElementA);
    // 得到女人结论或反应
    public abstract void getWomanConclusion(Woman concreteElementB);

}
