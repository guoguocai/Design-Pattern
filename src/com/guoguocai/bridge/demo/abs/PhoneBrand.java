package com.guoguocai.bridge.demo.abs;

/**
 * 手机品牌抽象类
 *
 * @auther guoguocai
 * @date 2019/1/14 22:44
 */
public abstract class PhoneBrand {

    protected PhoneSoft phoneSoft;

    // 设置手机软件
    public void setPhoneSoft(PhoneSoft soft) {
        this.phoneSoft = soft;
    }

    // 运行（品牌需要关注软件，以便在机器中安装，以备运行。）
    public abstract void run();
}
