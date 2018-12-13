package com.guoguocai.factorymethod.demo.interfaces;

/**
 * 工厂方法接口，就是对工厂类作进一步的抽象。
 * 此时当有新的运算加进来时，只需要增加一个
 * 工厂子类即可，不会修改原有的工厂类。
 *
 * @auther guoguocai
 * @date 2018/12/13 22:24
 */
public interface IFactory {

    IOperation createOperation();
}
