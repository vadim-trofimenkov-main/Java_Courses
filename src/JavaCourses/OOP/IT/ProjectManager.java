package JavaCourses.OOP.IT;

public class ProjectManager extends ProjectWorker implements IManager {

    @Override
    public void manage() {
        System.out.println("Управляю");
    }
}
