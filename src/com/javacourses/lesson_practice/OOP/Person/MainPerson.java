package com.javacourses.lesson_practice.OOP.Person;

public class MainPerson {
    public static void main(String[] args) {
        Person[] person = {new Person("Вася", 21, 180),
                new Person("Андрей", 25, 166),
                new Person("Елисей", 34, 170),
                new Person("Аркадий", 37, 201),
                new Person("Григорий", 18, 175),
        };
        for (Person value : person) {
            System.out.println(value);
        }
        System.out.println();
sortByHeight(person);
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
    private static void sortByHeight(Person[] person) {
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                Person person1 = person[j];
                Person person2 = person[j + 1];
                if (person1.compareByHeight(person2) < 0) {
                    Person tempPerson = person[j];
                    person[j] = person[j+1];
                    person[j+1] = tempPerson;
                }
            }
        }
    }
}
