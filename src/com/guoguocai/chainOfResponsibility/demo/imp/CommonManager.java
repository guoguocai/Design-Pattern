package com.guoguocai.chainOfResponsibility.demo.imp;

import com.guoguocai.chainOfResponsibility.demo.abs.Manager;
import com.guoguocai.chainOfResponsibility.demo.bean.Request;

/**
 * 经理
 *
 * @auther guoguocai
 * @date 2019/1/19 17:04
 */
public class CommonManager extends Manager {

    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void getRequestInfo(Request request) {
        // 经理的权限是可准许下属 2 天内的假期
        if (request.getRequestType().equals("请假") && request.getNumber() <= 2) {
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
