package com.guoguocai.decorator.demo.component;

/**
 * 组件类，这里以人为例。
 *
 * @auther guoguocai
 * @date 2018/12/25 22:00
 */
public class Person {

    private String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name + "打扮好了！");
    }
}
