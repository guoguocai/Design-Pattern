package com.guoguocai.chainOfResponsibility.demo;

import com.guoguocai.chainOfResponsibility.demo.bean.Request;
import com.guoguocai.chainOfResponsibility.demo.imp.CommonManager;
import com.guoguocai.chainOfResponsibility.demo.imp.GeneralManager;
import com.guoguocai.chainOfResponsibility.demo.imp.Majordomo;

/**
 * @auther guoguocai
 * @date 2019/1/19 18:02
 */
public class Client {

    public static void main(String[] args) {

        CommonManager common = new CommonManager("金里");
        Majordomo majordomo = new Majordomo("宗间");
        GeneralManager general = new GeneralManager("总金李");

        // 设置上级（这是关键点，可根据实际需要设置。）
        common.setSuperior(majordomo);
        majordomo.setSuperior(general);

        /**
         * 客户端的申请都由经理发起，但实际谁来决策
         * 由具体管理类来处理，客户端不知道。
         */
        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setRequestContent("小菜请假");
        request1.setNumber(1);
        common.getRequestInfo(request1);

        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        common.getRequestInfo(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜请求加薪");
        request3.setNumber(500);
        common.getRequestInfo(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("小菜请求加薪");
        request4.setNumber(1000);
        common.getRequestInfo(request4);

    }
}
