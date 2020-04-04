
package com.javacourses.homework.oop.it_worker;

public class AutomationTester extends Tester implements IDeveloper {
    public AutomationTester(EPosition ePosition) {
        super(ePosition);
    }

    @Override
    public void develop() {
        System.out.println("Пишу автотесты");
    }
}
