package JavaCourses.OOP.IT;

public class TeamLead extends ProjectWorker implements IManager, IDeveloper {
    public TeamLead(EPosition ePosition) {
        super(ePosition);
    }
    TeamLead() {
    }

    @Override
    public void develop() {
        System.out.println("Разрабатываю как тим лид");
    }

    @Override
    public void manage() {
        System.out.println("Управляю как тим лид");
    }
}
