package com.javacourses.homework.oop.arena;

public class Arena {
    public static void main(String[] args) {
        Squire squire = new Squire();
        FireMage fireMage = new FireMage();
        System.out.println(fireMage);
        System.out.println(squire);
        fireMage.attack(squire);
    }
}

