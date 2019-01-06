package com.guoguocai.prototype.demo2;

/**
 * Demo1 为浅复制，这样的方式对于引用的对象来说，
 * 引用对象的数据是不会被克隆过来的。也就是它只复
 * 制了引用，对象还是指向的原来的对象。
 *
 * 浅复制的后果就是当我们修改了克隆出的最新的对象
 * 时，实际上会把之前原先的对象数据也一并修改掉。
 *
 * 深复制把引用对象的变量指向复制过来的新对象，而
 * 不是指向原有的被引用的对象。修改某一个简历时不
 * 会影响其他的简历。
 *
 * @auther guoguocai
 * @date 2019/1/6 17:51
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("------------- 深复制 ---------------");

        Resume resume = new Resume("Chaser");
        resume.setPersonalInfo("男", "24");
        resume.setWorkExperience("2016-2017", "XX公司");

        Resume resume2 = resume.clone();
        resume2.setWorkExperience("1990-1995","小公司");

        Resume resume3 = resume.clone();
        resume3.setPersonalInfo("男", "60");
        resume3.setWorkExperience("2000-2002", "国际公司");

        resume.display();
        resume2.display();
        resume3.display();
    }
}
