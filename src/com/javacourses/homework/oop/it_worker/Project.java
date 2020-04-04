
package com.javacourses.homework.oop.it_worker;

public class Project {
    private ITWorker[] team;

    public Project(ITWorker[] team) {
        this.team = team;
    }

    private void workingDay() {
        for (Object a : team) {
            if (a instanceof ITBeginner) {
                ((ITBeginner) a).makeCoffee();
            }
        }
    }

    public static void main(String[] args) {
        ITWorker[] team =
                {
                        new ITBeginner(),
                        new ProjectManager(),
                        new TeamLead(),
                        new Tester(),
                        new ProjectDeveloper(EPosition.JUNIOR),
                        new ProjectDeveloper(EPosition.JUNIOR),
                        new ProjectDeveloper(EPosition.MIDDLE),
                        new ProjectDeveloper(EPosition.MIDDLE),
                        new ProjectDeveloper(EPosition.MIDDLE),
                        new ProjectDeveloper(EPosition.SENIOR),
                };
        Project project = new Project(team);
        project.workingDay();
    }
}
