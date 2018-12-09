package com.guoguocai.singleton;

/**
 * 单例模式（懒汉式）
 *
 * 在第一次被引用时，才会将自己实例化，这样的机制会面临
 * 多线程访问的安全问题，双重锁定处理是保证线程安全的最好方式。
 *
 * @auther guoguocai
 * @date 2018/12/9 21:22
 */
public class SingletonPatternLazyMan {

    private static SingletonPatternLazyMan instanceLazy;

    private SingletonPatternLazyMan() {

    }

    public static SingletonPatternLazyMan getInstanceLazy() {
        /* 双重锁定 */
        if (instanceLazy == null) {
            synchronized (SingletonPatternLazyMan.class) {
                if (instanceLazy == null) {
                    instanceLazy = new SingletonPatternLazyMan();
                }
            }
        }

        return instanceLazy;
    }
}
