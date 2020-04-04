package com.javacourses.lesson_practice.OOP.animal;

public class Nursery {
    private Animal[] animals;

    public Nursery(Animal... animals) {
        this.animals = animals;
    }

    public void comb() {
        for (Animal animal : animals) {
            if (animal instanceof HasWool) {
                HasWool hasWool = (HasWool) animal;
                boolean wool = hasWool.hasWool();
                if (wool) {
                    hasWool.comb();
                }
            }
        }
    }
    public void train() {
        for (Animal animal : animals) {
            if (animal instanceof Trainable) {
                Trainable trainable = (Trainable) animal;
                 trainable.train();
            }
        }
    }

    public Animal[] getAnimals() {
        return animals;
    }

}
