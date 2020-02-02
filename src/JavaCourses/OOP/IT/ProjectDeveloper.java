package JavaCourses.OOP.IT;

public class ProjectDeveloper extends ProjectWorker implements IDeveloper {

    @Override
    public void develop() {
        System.out.println("Разрабатываю");
    }
}
