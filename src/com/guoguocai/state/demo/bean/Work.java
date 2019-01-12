package com.guoguocai.state.demo.bean;

import com.guoguocai.state.demo.abs.State;
import com.guoguocai.state.demo.imp.ForenoonState;

/**
 * 工作类
 *
 * @auther guoguocai
 * @date 2019/1/12 19:08
 */
public class Work {

    private State current;
    //“钟点”属性，状态转换的依据。
    private double hour;
    //“任务完成”属性，作为判断是否能下班的依据。
    private boolean finish = false;

    /**
     * 工作初始化为上午工作状态，
     * 即上午 9 点开始上班。
     */
    public Work(){
        current = new ForenoonState();
    }

    public void setState(State s) {
        current = s;
    }

    public void writeProgram() {
        current.writeProgram(this);
    }


    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
