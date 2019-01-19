package com.guoguocai.chainOfResponsibility.demo.imp;

import com.guoguocai.chainOfResponsibility.demo.abs.Manager;
import com.guoguocai.chainOfResponsibility.demo.bean.Request;

/**
 * 总监
 *
 * @auther guoguocai
 * @date 2019/1/19 17:53
 */
public class Majordomo extends Manager {

    public Majordomo(String name) {
        super(name);
    }

    @Override
    public void getRequestInfo(Request request) {
        // 总监的权限是可准许下属一周内的假期
        if (request.getRequestType().equals("请假") && request.getNumber() <= 7) {
            System.out.println(name + ":"
                    + request.getRequestContent()
                    + " 数量：" + request.getNumber() + " 被批准！");
        } else {
            // 其余申请需转给上级
            if (superior != null) {
                superior.getRequestInfo(request);
            }
        }
    }
}
