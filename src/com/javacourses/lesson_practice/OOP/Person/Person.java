package com.javacourses.lesson_practice.OOP.Person;

import java.util.Objects;

public class Person {
    private int age;
    private int height;
    private String name;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Wrong age");
        } else {
            this.age = age;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int compareByHeight(Person person) {
        int height = person.getHeight();
        if (this.height > height) {
            return 1;
        } else if (this.height < height) {
            return -1;
        } else {
        return 0;
    }
}



    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\n" + "Height: " + height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !this.getClass().equals(o.getClass())) {
            return false;
        }
        Person person = (Person) o;
        return this.height == person.getHeight() &&
                this.age == person.getAge() &&
                Objects.equals(this.name, person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, height, name);
    }


}
