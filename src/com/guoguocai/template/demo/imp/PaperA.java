package com.guoguocai.template.demo.imp;

import com.guoguocai.template.demo.abs.TestPaper;

/**
 * 学生 A 的试卷
 *
 * @auther guoguocai
 * @date 2019/1/6 15:43
 */
public class PaperA extends TestPaper {

    @Override
    public String answer1() {
        return "B";
    }

    @Override
    public String answer2() {
        return "B";
    }

    @Override
    public String answer3() {
        return "A";
    }
}
