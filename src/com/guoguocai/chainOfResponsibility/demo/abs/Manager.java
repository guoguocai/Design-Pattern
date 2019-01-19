package com.guoguocai.chainOfResponsibility.demo.abs;

import com.guoguocai.chainOfResponsibility.demo.bean.Request;

/**
 * 管理者
 *
 * @auther guoguocai
 * @date 2019/1/19 16:55
 */
public abstract class Manager {

    protected String name;
    protected Manager superior;// 管理者的上级

    public Manager(String name) {
        this.name = name;
    }

    // 关键方法：设置管理者的上级
    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    // 发起申请
    public abstract void getRequestInfo(Request request);
}
