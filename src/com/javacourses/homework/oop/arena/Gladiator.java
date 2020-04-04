package com.javacourses.homework.oop.arena;

public class Gladiator extends Warrior {
    private int defence = 35;

    public Gladiator(String name) {
        super(name, 30, 100);
    }

    @Override
    public void takeDamage(int damage) {
        if (defence > 0) {
            if (defence >= damage) {
                defence -= damage;
            } else {
                damage = damage - defence;
                health -= damage;
                defence = 0;
            }
        } else {
            health -= damage;
        }
    }

    @Override
    public void attack(Warrior warrior) {
        warrior.takeDamage(attack);
    }
}
