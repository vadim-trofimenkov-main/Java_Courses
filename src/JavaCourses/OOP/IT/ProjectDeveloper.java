package JavaCourses.OOP.IT;

public class ProjectDeveloper extends ProjectWorker implements IDeveloper {

    ProjectDeveloper(EPosition ePosition) {
        super(ePosition);
    }

    @Override
    public void develop() {
        System.out.println("Разрабатываю");
    }
}
