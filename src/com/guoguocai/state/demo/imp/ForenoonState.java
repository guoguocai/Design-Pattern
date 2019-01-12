package com.guoguocai.state.demo.imp;

import com.guoguocai.state.demo.abs.State;
import com.guoguocai.state.demo.bean.Work;

/**
 * 上午工作状态
 *
 * @auther guoguocai
 * @date 2019/1/12 19:19
 */
public class ForenoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 12) {
            System.out.println("当前时间：" + work.getHour() + "点，上午工作，精神百倍。");
        } else {
            //超过 12 点，则转入中午工作状态。
            work.setState(new NoonState());
            work.writeProgram();
        }
    }
}
