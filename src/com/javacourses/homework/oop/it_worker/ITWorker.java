package com.javacourses.homework.oop.it_worker;

public class ITWorker implements ICoffeeMaker {

    @Override
    public void makeCoffee() {
        System.out.println("Вот ваш Кофе, сэр");
    }
}
