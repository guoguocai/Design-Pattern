package com.guoguocai.state.demo.imp;

import com.guoguocai.state.demo.abs.State;
import com.guoguocai.state.demo.bean.Work;

/**
 * 中午工作状态
 *
 * @auther guoguocai
 * @date 2019/1/12 19:23
 */
public class NoonState extends State{

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13) {
            System.out.println("当前时间：" + work.getHour() + "点，饿了，午饭，犯困，午休。");
        } else {
            //超过 13 点，则转入下午工作状态。
            work.setState(new AfternoonState());
            work.writeProgram();
        }
    }
}
