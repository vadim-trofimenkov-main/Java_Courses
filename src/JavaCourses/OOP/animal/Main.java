package JavaCourses.OOP.animal;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Dog 1"),
                new Cat("Cat 1", false),
                new Dog("Dog 2"),
                new Cat("Cat 2", true),
                new Dog("Dog 3"),
                new Dog("Dog 4"),
                new Dog("Dog 5"),
                new Cat("Cat 3", true)
        };

        Dog dog = new Dog("dog");
        Cat cat = new Cat("cat");

        int compare = dog.compareTo(cat);
        System.out.println(compare);
    }
}
