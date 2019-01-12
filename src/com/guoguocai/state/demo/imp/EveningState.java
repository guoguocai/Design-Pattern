package com.guoguocai.state.demo.imp;

import com.guoguocai.state.demo.abs.State;
import com.guoguocai.state.demo.bean.Work;

/**
 * 晚间工作状态
 *
 * @auther guoguocai
 * @date 2019/1/12 19:25
 */
public class EveningState extends State {

    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()) {
            // 如果完成任务，则转入下班状态。
            work.setState(new RestState());
            work.writeProgram();
        } else {
            if (work.getHour() < 21) {
                System.out.println("当前时间：" + work.getHour() + "点，加班哦，疲累之极。");
            } else {
                //超过 21 点，则转入睡眠工作状态。
                work.setState(new SleepingState());
                work.writeProgram();
            }
        }
    }
}
