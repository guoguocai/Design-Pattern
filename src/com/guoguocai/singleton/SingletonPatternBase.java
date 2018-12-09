package com.guoguocai.singleton;

/**
 * 单例模式（基本形式）
 * 主要思想：让类自身负责保存它的唯一实例。
 *
 * @auther guoguocai
 * @date 2018/12/9 20:04
 */
public class SingletonPatternBase {

    /**
     * 全局变量
     */
    private static SingletonPatternBase instance;

    /**
     * 将默认构造方法设置为 private，
     * 使得外界不能通过 new 来创建此类的实例。
     */
    private SingletonPatternBase() {

    }

    /**
     * 此方法是获得本类实例的唯一访问点。
     * @return
     */
    public static SingletonPatternBase getInstance() {

        if (instance == null) {
            instance = new SingletonPatternBase();
        }

        return instance;
    }


    /**
     * main 方法测试
     * @param args
     */
    public static void main(String[] args) {
        SingletonPatternBase single1 = SingletonPatternBase.getInstance();
        SingletonPatternBase single2 = SingletonPatternBase.getInstance();
        if (single1 == single2) {
            System.out.println("两个对象是相同的实例！");
        }
    }


}
