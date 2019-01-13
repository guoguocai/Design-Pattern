package com.guoguocai.flyweight.demo.bean;

/**
 * 在享元对象内部并且不会随环境改变而改变的共享部分，
 * 称为享元对象的内部状态；而随环境改变而改变的，不能
 * 共享的状态就是外部状态。
 *
 * 在此例中，虽然网站是共用的，但是网站的所有者是不同
 * 的。就像淘宝店铺一样，每个店铺的界面布局和店铺的功
 * 能都类似，但是开店的人肯定是不一样的。
 *
 * 所以这里的 User 就是属于外部状态，类似于网站的客
 * 户账号，使用时通过参数传进来。
 *
 * @auther guoguocai
 * @date 2019/1/13 13:54
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
