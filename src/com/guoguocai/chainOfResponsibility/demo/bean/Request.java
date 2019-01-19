package com.guoguocai.chainOfResponsibility.demo.bean;

/**
 * 申请
 *
 * @auther guoguocai
 * @date 2019/1/19 16:56
 */
public class Request {

    private String requestType;// 申请类型
    private String requestContent;// 申请内容
    private int number;// 数量

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(String requestContent) {
        this.requestContent = requestContent;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
