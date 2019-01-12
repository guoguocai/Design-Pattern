package com.guoguocai.state.demo.imp;

import com.guoguocai.state.demo.abs.State;
import com.guoguocai.state.demo.bean.Work;

/**
 * 睡眠状态
 *
 * @auther guoguocai
 * @date 2019/1/12 19:25
 */
public class SleepingState extends State {

    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点，不行了，睡着了。");
    }
}
