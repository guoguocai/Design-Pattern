package com.guoguocai.memento.demo1;

/**
 * 此种做法虽然也能实现保存进度的需求，
 * 但是客户端承担的职责太大了，游戏角色
 * 的细节暴露给了客户端，以后功能有改动
 * 时会非常麻烦。
 *
 * 更好的做法是将游戏角色的存取状态封装
 * 在外部的类当中，让职责分离（Demo2）。
 *
 * @auther guoguocai
 * @date 2019/1/5 16:22
 */
public class Client {

    public static void main(String[] args) {

        // 大战 Boss 前
        GameRole gameRole = new GameRole();
        gameRole.getInitState();
        gameRole.displayState();

        // 创建一个新实例，用来保存进度。
        GameRole backup = new GameRole();
        backup.setLives(gameRole.getLives());
        backup.setAttack(gameRole.getAttack());
        backup.setDefense(gameRole.getDefense());

        // 大战 Boss ，损耗严重。
        gameRole.fight();
        gameRole.displayState();

        // 不甘心，恢复大战 Boss 前的状态重新玩。
        gameRole.setLives(backup.getLives());
        gameRole.setAttack(backup.getAttack());
        gameRole.setDefense(backup.getDefense());

        gameRole.displayState();

    }
}
