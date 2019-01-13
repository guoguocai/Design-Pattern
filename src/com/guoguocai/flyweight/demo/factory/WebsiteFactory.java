package com.guoguocai.flyweight.demo.factory;

import com.guoguocai.flyweight.demo.abs.Website;
import com.guoguocai.flyweight.demo.imp.ConcreteWebsite;

import java.util.Hashtable;

/**
 * 网站工厂
 *
 * @auther guoguocai
 * @date 2019/1/13 15:07
 */
public class WebsiteFactory {

    private Hashtable flyweights = new Hashtable();

    // 获得网站分类（核心）
    public Website getWebsiteCategory(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteWebsite(key));
        }
        return (Website) flyweights.get(key);
    }


    // 获得网站分类总数
    public int getWebsiteCount() {
        return flyweights.size();
    }
}
