package JavaCourses.OOP.IT;

public class TeamLead extends ProjectWorker implements IManager, IDeveloper {
    @Override
    public void develop() {
        System.out.println("Разрабатываю как тим лид");
    }

    @Override
    public void manage() {
        System.out.println("Управляю как тим лид");
    }
}
