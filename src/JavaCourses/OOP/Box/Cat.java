package JavaCourses.OOP.Box;

public class Cat {
    private int age;
    private String name;
    private int height;
    boolean alive;

    Cat(String name, int age, int height, boolean alive) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Height: " + height + " IsAlive? - " + alive;
    }
}
