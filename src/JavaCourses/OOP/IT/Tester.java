package JavaCourses.OOP.IT;

public class Tester extends ProjectWorker implements ITester {
    Tester(EPosition ePosition) {
        super(ePosition);
    }

    Tester() {

    }

    @Override
    public void test() {
        System.out.println("Тестирую");
    }
}
