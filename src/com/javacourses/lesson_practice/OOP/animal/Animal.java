package com.javacourses.lesson_practice.OOP.animal;

import java.util.Objects;

public abstract class Animal implements Comparable<Animal> {
    protected String name;
    protected HungerType hunger;
    protected int health;

    protected Animal(String name) {
        this.name = name;
        this.hunger = HungerType.NORMAL;
    }

    @Override
    public int compareTo(Animal a) {
        return name.compareTo(a.name);
    }

    public abstract String voice();

    public abstract void eat();

    public void call(String name) {
        if (this.name.equals(name)) {
            System.out.println(voice());
        } else {
            System.out.println("...");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HungerType getHunger() {
        return hunger;
    }

    public void setHunger(HungerType hunger) {
        this.hunger = hunger;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return health == animal.health &&
                Objects.equals(name, animal.name) &&
                hunger == animal.hunger;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hunger, health);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", hunger=" + hunger +
                ", health=" + health +
                '}';
    }
}