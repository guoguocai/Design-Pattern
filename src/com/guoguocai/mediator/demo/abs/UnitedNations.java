package com.guoguocai.mediator.demo.abs;

/**
 * 联合国机构抽象类
 *
 * 其实联合国就是中介者，但是由于其下有很多机构，
 * 比如安理会、教科文组织、世界卫生组织等等，这些
 * 都是扩展出来的具体中介者，因此这里抽象出了一个
 * 父类出来。
 *
 * 在没有扩展中介者的情况下是不需要抽象父类的，只
 * 需要一个中介者类即可。
 *
 * @auther guoguocai
 * @date 2019/1/8 22:50
 */
public abstract class UnitedNations {

    public abstract void declare(String message, Country colleague);
}
