package com.guoguocai.prototype.demo1;

/**
 * @auther guoguocai
 * @date 2019/1/6 16:29
 */
public class Client {

    public static void main(String[] args) {

        // 最不好的写法，实例化次数太多，
        // 但其实每份简历都是一样的，修改起来很麻烦。
        System.out.println("------------------------- 最不好的写法： -------------------------");

        Resume resume1 = new Resume("Chaser");
        resume1.setPersonalInfo("男", "24");
        resume1.setWorkExperience("2016-2017", "XX公司");

        Resume resume2 = new Resume("Chaser");
        resume2.setPersonalInfo("男", "24");
        resume2.setWorkExperience("2016-2017", "XX公司");

        Resume resume3 = new Resume("Chaser");
        resume3.setPersonalInfo("男", "24");
        resume3.setWorkExperience("2016-2017", "XX公司");

        resume1.display();
        resume2.display();
        resume3.display();

        System.out.println("------------------------- 运用原型模式的写法（浅复制）： -------------------------");

        Resume resume4 = new Resume("Chaser");
        resume4.setPersonalInfo("男", "24");
        resume4.setWorkExperience("2016-2017", "XX公司");

        Resume resume5 = resume4.clone();
        resume5.setWorkExperience("2017-2019", "YY公司");

        Resume resume6 = resume4.clone();
        resume6.setPersonalInfo("男", "30");

        resume4.display();
        resume5.display();
        resume6.display();
    }
}
