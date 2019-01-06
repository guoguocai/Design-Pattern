package com.guoguocai.prototype.demo1;

/**
 * 简历类
 *
 * @auther guoguocai
 * @date 2019/1/6 16:19
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    // 设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    // 显示
    public void display() {
        System.out.println(name + " ," + sex + " ," + age);
        System.out.println("工作经历： " + timeArea + " ," + company);
    }


    // 可能会抛出不支持克隆异常，原因是没有实现Cloneable接口。
    // 此处为浅复制
    @Override
    protected Resume clone(){
        try{
            return (Resume) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }

}
