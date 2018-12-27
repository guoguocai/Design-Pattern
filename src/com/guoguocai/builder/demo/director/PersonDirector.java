package com.guoguocai.builder.demo.director;

import com.guoguocai.builder.demo.interfaces.PersonBuilder;

/**
 * 指挥者：
 * 用来控制建造过程，也用它来隔离用户与建造过程的关联。
 *
 * @auther guoguocai
 * @date 2018/12/27 23:08
 */
public class PersonDirector {

    private PersonBuilder personBuilder;

    /**
     * 根据用户的选择来决定建造什么样的小人
     * @param person
     */
    public PersonDirector(PersonBuilder person) {
        this.personBuilder = person;
    }


    /**
     * 控制建造过程
     */
    public void createPerson() {
        personBuilder.buildHead();
        personBuilder.buildBody();
        personBuilder.buildArmLeft();
        personBuilder.buildArmRight();
        personBuilder.buildLegLeft();
        personBuilder.buildLegRight();
    }
}
