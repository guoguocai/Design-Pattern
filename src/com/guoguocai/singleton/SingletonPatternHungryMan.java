package com.guoguocai.singleton;

/**
 * 单例模式（饿汉式）
 *
 * 采用的是静态初始化的方式，即加载类时就将自己实例化，
 * 因此不存在多线程创建多个对象的情况，但是会提前占用系统资源。
 *
 * @auther guoguocai
 * @date 2018/12/9 20:32
 */
public class SingletonPatternHungryMan {

    /**
     * 给实例加上 final 修饰符，使其初始化后就不能再发生更改。
     * 更保险的做法是可以给类也加上 final 修饰符，防止其因派生而增加实例。
     */
    private static final SingletonPatternHungryMan instanceHungry
            = new SingletonPatternHungryMan();

    private SingletonPatternHungryMan() {

    }

    public static SingletonPatternHungryMan getInstanceHungry() {
        return instanceHungry;
    }
}
