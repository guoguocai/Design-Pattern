package com.guoguocai.state.demo.imp;

import com.guoguocai.state.demo.abs.State;
import com.guoguocai.state.demo.bean.Work;

/**
 * 下班休息状态
 *
 * @auther guoguocai
 * @date 2019/1/12 19:26
 */
public class RestState extends State {

    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点，下班回家了。");
    }
}
