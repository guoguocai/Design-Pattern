package com.guoguocai.prototype.demo2;

/**
 * 工作经历实体类
 * 如果想要实现深复制，那么被引用的对象类型也要实现 Cloneable 接口。
 *
 * @auther guoguocai
 * @date 2019/1/6 17:25
 */
public class WorkExperience implements Cloneable {

    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    protected WorkExperience clone(){
        try{
            return (WorkExperience) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}
