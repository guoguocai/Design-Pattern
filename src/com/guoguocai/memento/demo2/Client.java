package com.guoguocai.memento.demo2;

/**
 * 优点：
 * 使用备忘录可以把复杂对象的内部信息对其他的对象屏蔽起来。
 * 当角色状态改变的时候，有可能这个状态无效，这时候就可以
 * 使用暂存的备忘录将状态复原。
 *
 * 适用场景：
 * 适用于功能比较复杂的，但需要维护或记录属性历史的类。
 *
 * 缺点：
 * 以 Demo2 为例，角色状态需要完整存储到备忘录对象中，
 * 如果状态数据很大很多，那么在资源的消耗上，备忘录对象
 * 会非常耗内存。
 *
 * @auther guoguocai
 * @date 2019/1/5 17:01
 */
public class Client {

    public static void main(String[] args) {
        // 大战 Boss 前
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.displayState();

        // 通过角色状态存储类来保存进度
        RoleStateManage stateManage = new RoleStateManage();
        RoleStateMemento stateMemento = gameRole.saveState();
        stateManage.setMemento(stateMemento);

        // 大战 Boss ，损耗严重。
        gameRole.fight();
        gameRole.displayState();

        // 不甘心，恢复大战 Boss 前的状态重新玩。
        gameRole.recoveryState(stateManage.getMemento());
        gameRole.displayState();
    }
}
