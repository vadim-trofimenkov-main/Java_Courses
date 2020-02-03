
package JavaCourses.OOP.IT;

public class AutomationTester extends Tester implements IDeveloper {
    public AutomationTester(EPosition ePosition) {
        super(ePosition);
    }

    @Override
    public void develop() {
        System.out.println("Пишу автотесты");
    }
}
