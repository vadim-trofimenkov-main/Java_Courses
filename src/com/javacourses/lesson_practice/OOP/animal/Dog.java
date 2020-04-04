package com.javacourses.lesson_practice.OOP.animal;

public class Dog extends Animal implements Trainable {
    protected Dog(String name) {
        super(name);
    }
@Override
public void train(){
    System.out.println("Train");
}
    @Override
    public String voice() {
        return "Waf";
    }

    @Override
    public void eat() {

    }

}