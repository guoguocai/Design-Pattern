package com.guoguocai.visitor.demo;

import com.guoguocai.visitor.demo.abs.Action;
import com.guoguocai.visitor.demo.abs.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 *
 * @auther guoguocai
 * @date 2019/1/19 20:23
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<Person>();

    // 增加
    public void attach(Person element) {
        elements.add(element);
    }

    // 移除
    public void detach(Person element) {
        elements.remove(element);
    }

    // 查看显示
    public void display(Action visitor) {
        for (Person p:
             elements) {
            p.accept(visitor);
        }
    }
}

