package com.javacourses.homework.oop.randompanel;

public class Button extends Controller implements Clickable {
    @Override
    public void click() {
        System.out.println("OK");
    }

    @Override
    void start() {
        click();
    }
}
