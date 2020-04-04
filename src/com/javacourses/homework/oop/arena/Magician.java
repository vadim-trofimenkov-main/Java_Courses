package com.javacourses.homework.oop.arena;

public class Magician extends Warrior{
    int mana;
    int cooldown;
    int magicAttack;

    Magician(String name, int attack, int health, int mana, int cooldown, int magicAttack) {
        super(name, attack, health);
        this.mana = mana;
        this.cooldown = cooldown;
        this.magicAttack = magicAttack;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }
}
