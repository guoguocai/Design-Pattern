package com.guoguocai.state.demo.imp;

import com.guoguocai.state.demo.abs.State;
import com.guoguocai.state.demo.bean.Work;

/**
 * 下午工作状态
 *
 * @auther guoguocai
 * @date 2019/1/12 19:24
 */
public class AfternoonState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 17) {
            System.out.println("当前时间：" + work.getHour() + "点，下午状态还不错，继续努力。");
        } else {
            //超过 17 点，则转入晚间工作状态。
            work.setState(new EveningState());
            work.writeProgram();
        }
    }
}
