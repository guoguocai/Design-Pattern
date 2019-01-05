package com.guoguocai.memento.demo2;

/**
 * 角色状态存储类（备忘录）
 *
 * @auther guoguocai
 * @date 2019/1/5 16:48
 */
public class RoleStateMemento {

    private int lives;// 生命值
    private int attack;// 攻击力
    private int defense;// 防御力

    public RoleStateMemento(int lives, int attack, int defense) {
        this.lives = lives;
        this.attack = attack;
        this.defense = defense;
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
