package com.guoguocai.memento.demo2;

/**
 * 角色状态管理类
 *
 * @auther guoguocai
 * @date 2019/1/5 16:59
 */
public class RoleStateManage {

    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
