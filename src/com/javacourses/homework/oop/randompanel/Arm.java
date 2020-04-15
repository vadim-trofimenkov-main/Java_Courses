package com.javacourses.homework.oop.randompanel;

public class Arm extends Controller implements Pullable {

    @Override
    public void pull() {
        System.out.println("PULLED");
    }

    @Override
    void start() {
        pull();
    }
}
