package com.guoguocai.prototype.demo2;

/**
 * 简历类
 *
 * @auther guoguocai
 * @date 2019/1/6 17:27
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;

    // 将 Demo1 中的工作经历封装成实体
    private WorkExperience workExperience = new WorkExperience();

    public Resume(String name) {
        this.name = name;
    }

    /**
     * 提供私有的构造函数，便于克隆 WorkExperience 的数据。
     * @param work
     */
    private Resume(WorkExperience work) {
        this.workExperience = work.clone();
    }

    // 设置个人信息
    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    // 设置工作经历
    public void setWorkExperience(String timeArea, String company) {
        workExperience.setWorkDate(timeArea);
        workExperience.setCompany(company);
    }

    // 显示
    public void display() {
        System.out.println(name + " ," + sex + " ," + age);
        System.out.println("工作经历： "
                + workExperience.getWorkDate() + " ,"
                + workExperience.getCompany());
    }


    /**
     * 深复制：
     *
     * 调用私有的构造方法先让 WorkExperience 克隆完成，
     * 然后再给其余的字段赋值，最终返回一个深复制的简历对象。
     * @return
     */
    @Override
    protected Resume clone(){

        Resume res = new Resume(this.workExperience);
        res.name = this.name;
        res.sex = this.sex;
        res.age = this.age;

        return res;
    }

}
