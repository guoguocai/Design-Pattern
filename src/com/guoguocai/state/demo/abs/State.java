package com.guoguocai.state.demo.abs;

import com.guoguocai.state.demo.bean.Work;

/**
 * 抽象状态类
 *
 * @auther guoguocai
 * @date 2019/1/12 19:07
 */
public abstract class State {

    public abstract void writeProgram(Work work);
}
