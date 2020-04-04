package com.javacourses.homework.oop.it_worker;

public class ProjectManager extends ProjectWorker implements IManager {

    public ProjectManager(EPosition ePosition) {
        super(ePosition);
    }

    ProjectManager() {

    }

    @Override
    public void manage() {
        System.out.println("Управляю");
    }
}
