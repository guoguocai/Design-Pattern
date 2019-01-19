package com.guoguocai.chainOfResponsibility.demo.imp;

import com.guoguocai.chainOfResponsibility.demo.abs.Manager;
import com.guoguocai.chainOfResponsibility.demo.bean.Request;

/**
 * 总经理
 *
 * @auther guoguocai
 * @date 2019/1/19 17:55
 */
public class GeneralManager extends Manager {

    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void getRequestInfo(Request request) {
        // 总经理的权限是可准许下属任意天数的假期
        if (request.getRequestType().equals("请假")) {
            System.out.println(name + ":"
                    + request.getRequestContent()
                    + " 数量：" + request.getNumber() + " 被批准！");

            // 加薪在 500 以内，没有问题。
        } else if (request.getRequestType().equals("加薪")
                && request.getNumber() <= 500) {
            System.out.println(name + ":"
                    + request.getRequestContent()
                    + " 数量：" + request.getNumber() + " 被批准！");

        } else if (request.getRequestType().equals("加薪")
                && request.getNumber() > 500) {
            System.out.println(name + ":"
                    + request.getRequestContent()
                    + " 数量：" + request.getNumber() + " 再说吧！");
        }
    }
}
