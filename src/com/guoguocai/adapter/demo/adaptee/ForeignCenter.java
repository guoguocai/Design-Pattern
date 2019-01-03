package com.guoguocai.adapter.demo.adaptee;

/**
 * 外籍中锋（比如在 NBA 的姚明）
 *
 * 代表需要适配的类，其中包含一些特殊的处理。
 *
 * @auther guoguocai
 * @date 2019/1/3 23:03
 */
public class ForeignCenter {

    private String name;

    // 外籍中锋只听得懂中文的进攻和防守
    public void 进攻(){
        System.out.println("外籍中锋 " + name + " 进攻");
    }

    public void 防守(){
        System.out.println("外籍中锋 " + name + " 防守");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
