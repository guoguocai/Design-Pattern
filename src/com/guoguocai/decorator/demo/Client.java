package com.guoguocai.decorator.demo;

import com.guoguocai.decorator.demo.component.Person;
import com.guoguocai.decorator.demo.fineryimp.*;

/**
 * 客户端
 *
 * @auther guoguocai
 * @date 2018/12/25 22:35
 */
public class Client {

    public static void main(String[] args) {
        Person person = new Person("Chaser");

        /**
         * 可以发现，每种打扮方式都是可以灵活组合的，
         * 能动态的添加装扮。
         *
         * 虽说装饰的先后顺序可以任意组合，但是在实际应用
         * 中装饰的顺序是非常重要的，比如加密数据和过滤词
         * 汇都可以是数据持久化前的装饰功能，但是如果是先
         * 加密后过滤，最后肯定是会出问题的。就像先穿西装
         * 外套后再穿 T 恤一样奇怪。
         */
        System.out.println("第一种打扮:");

        BigTrouser big = new BigTrouser();
        Suit suit = new Suit();
        Sneaker sneaker = new Sneaker();

        big.decorate(person);
        suit.decorate(big);
        sneaker.decorate(suit);

        sneaker.show();


        System.out.println("第二种打扮:");

        LeatherShoe shoe = new LeatherShoe();
        Tie tie = new Tie();
        TShirts shirt = new TShirts();

        shoe.decorate(person);
        tie.decorate(shoe);
        shirt.decorate(tie);

        shirt.show();
    }
}
