package com.guoguocai.template.demo;

import com.guoguocai.template.demo.abs.TestPaper;
import com.guoguocai.template.demo.imp.PaperA;
import com.guoguocai.template.demo.imp.PaperB;

/**
 * @auther guoguocai
 * @date 2019/1/6 15:49
 */
public class Client {

    public static void main(String[] args) {

        System.out.println("学生 A 的试卷：");
        TestPaper paperA = new PaperA();
        paperA.testQuestion1();
        paperA.testQuestion2();
        paperA.testQuestion3();

        System.out.println("-----------------------------");

        System.out.println("学生 B 的试卷：");
        TestPaper paperB = new PaperB();
        paperB.testQuestion1();
        paperB.testQuestion2();
        paperB.testQuestion3();
    }
}
