package com.guoguocai.template.demo.abs;

/**
 * 考试试卷 父类 模板方法
 *
 * 公共重复的内容都应该写在这里，
 * 学生只需要填答案即可。
 *
 * @auther guoguocai
 * @date 2019/1/6 14:59
 */
public abstract class TestPaper {

    /**
     * 模板方法，定义逻辑的框架，而逻辑是由一些
     * 相应的抽象操作组成，它们都推迟到子类中实现。
     */
    public void testQuestion1() {
        System.out.println("某学生用了 4 分钟跑完 1000 米，请问他身高多少？ 答案：" + answer1());
        System.out.println(" A.170cm B.180cm C.165cm D.175cm ");
    }

    public void testQuestion2() {
        System.out.println("小红的妈妈去菜市场买了30元钱菜，请问她几岁？ 答案：" + answer2());
        System.out.println(" A.30 B.20 C.40 D.50 ");
    }

    public void testQuestion3() {
        System.out.println("哥哥比弟弟大 6 岁，请问弟弟叫什么名字？ 答案：" + answer3());
        System.out.println(" A.小宝 B.小刚 C.小明 D.小红 ");
    }

    /**
     * 一些抽象行为，由子类实现。
     * @return
     */
    public abstract String answer1();
    public abstract String answer2();
    public abstract String answer3();
}
