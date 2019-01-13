package com.guoguocai.flyweight.demo;

import com.guoguocai.flyweight.demo.abs.Website;
import com.guoguocai.flyweight.demo.bean.User;
import com.guoguocai.flyweight.demo.factory.WebsiteFactory;

/**
 * @auther guoguocai
 * @date 2019/1/13 15:14
 */
public class Client {

    public static void main(String[] args) {

        WebsiteFactory factory = new WebsiteFactory();

        Website website1 = factory.getWebsiteCategory("产品展示");
        website1.use(new User("小明"));

        Website website2 = factory.getWebsiteCategory("产品展示");
        website2.use(new User("小花"));

        Website website3 = factory.getWebsiteCategory("产品展示");
        website3.use(new User("小刚"));

        Website website4 = factory.getWebsiteCategory("博客");
        website4.use(new User("朱雀"));

        Website website5 = factory.getWebsiteCategory("博客");
        website5.use(new User("玄武"));

        Website website6 = factory.getWebsiteCategory("博客");
        website6.use(new User("共工"));

        System.out.println("已创建的网站类别总数为:" + factory.getWebsiteCount());
    }
}
