package com.guoguocai.memento.demo1;

/**
 * 游戏角色类
 *
 * @auther guoguocai
 * @date 2019/1/5 16:14
 */
public class GameRole {

    private int lives;// 生命值
    private int attack;// 攻击力
    private int defense;// 防御力

    // 显示当前状态
    public void displayState() {
        System.out.println("游戏角色当前状态:");
        System.out.println("生命值： " + this.lives);
        System.out.println("攻击力： " + this.attack);
        System.out.println("防御力： " + this.defense);
    }

    // 初始状态
    public void getInitState() {
        this.lives = 100;
        this.attack = 100;
        this.defense = 100;
    }

    // 与 Boss 大战后数据损耗至 0
    public void fight() {
        this.lives = 0;
        this.attack = 0;
        this.defense = 0;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
