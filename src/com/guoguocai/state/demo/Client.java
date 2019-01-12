package com.guoguocai.state.demo;

import com.guoguocai.state.demo.bean.Work;

/**
 * @auther guoguocai
 * @date 2019/1/12 19:57
 */
public class Client {

    public static void main(String[] args) {
        //紧急项目
        Work emergencyPro = new Work();
        emergencyPro.setHour(9);
        emergencyPro.writeProgram();
        emergencyPro.setHour(10);
        emergencyPro.writeProgram();
        emergencyPro.setHour(12);
        emergencyPro.writeProgram();
        emergencyPro.setHour(13);
        emergencyPro.writeProgram();
        emergencyPro.setHour(14);
        emergencyPro.writeProgram();
        emergencyPro.setHour(17);

//        emergencyPro.setFinish(true);
        emergencyPro.setFinish(false);

        emergencyPro.writeProgram();
        emergencyPro.setHour(19);
        emergencyPro.writeProgram();
        emergencyPro.setHour(22);
        emergencyPro.writeProgram();
    }
}
