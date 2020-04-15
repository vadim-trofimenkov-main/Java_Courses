package com.javacourses.homework.oop.randompanel;

public class ControlPanel {
    private static Controller[] controllers = {
            new Button(),
            new Button(),
            new Arm(),
            new Button(),
            new Button(),
            new Arm(),
            new BigRedButton(),
            new Button(),
            new Button(),
            new Arm()
    };

    void start() {
        System.out.println("Нажимаю все кнопки, кроме Красной");
        for (Controller controller : controllers) {
            if (controller.getClass().getName().equals("com.javacourses.homework.oop.randompanel.Button")) {
                controller.start();
            }
        }
        System.out.println("Тяну все рычаги");
        for (Controller controller : controllers) {
            if (controller.getClass().getName().equals("com.javacourses.homework.oop.randompanel.Arm")) {
                controller.start();
            }
        }
    }
}
