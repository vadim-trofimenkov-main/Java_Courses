package com.javacourses.lesson_practice.OOP.animal;

public class Cat extends Animal implements HasWool {
    private boolean hasWool;

    public Cat(String name, boolean hasWool) {
        super(name);
        this.hasWool = hasWool;
    }

    public Cat(String name) {
        super(name);
        this.hasWool = true;
    }

    @Override
    public String voice() {
        return "Miyau";
    }

    @Override
    public void eat() {

    }

    @Override
    public boolean hasWool() {
        return this.hasWool;
    }

    @Override
    public void comb() {
        if (hasWool()) {
            System.out.println("OK");
        } else {
            System.out.println("NO WOOOL!!!!");
        }
    }
}