package com.guoguocai.builder.demo;

import com.guoguocai.builder.demo.director.PersonDirector;
import com.guoguocai.builder.demo.imp.PersonFatBuilder;
import com.guoguocai.builder.demo.imp.PersonThinBuilder;

/**
 * @auther guoguocai
 * @date 2018/12/27 22:58
 */
public class Client {

    public static void main(String[] args) {

        /* 画一个瘦子 */
        PersonThinBuilder thinPerson = new PersonThinBuilder();
        PersonDirector director1 = new PersonDirector(thinPerson);
        director1.createPerson();

        System.out.println();

        /* 画一个胖子 */
        PersonFatBuilder fatPerson = new PersonFatBuilder();
        PersonDirector director2 = new PersonDirector(fatPerson);
        director2.createPerson();
    }
}
