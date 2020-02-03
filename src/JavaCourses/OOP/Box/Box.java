package JavaCourses.OOP.Box;

import java.util.Random;

public class Box {
    private Cat cat;
    private boolean opened;
    private int catAliveProbability;

    public Box(Cat cat) {
        this.cat = cat;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Вася", 5, 35, true);
        Box box = new Box(cat);
        System.out.println(box);
        box.catAliveProbability();
        box.openBox();
        box.catAliveProbability();
        System.out.println(box);
    }

    public boolean getOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

    public int getDeathProbability() {
        return catAliveProbability;
    }

    public void setDeathProbability(int deathProbability) {
        this.catAliveProbability = deathProbability;
    }

    public void catAliveProbability() {
        if ((opened == true) && (cat.alive == true)) {
            catAliveProbability = 100;
        }
        if ((opened == true) && (cat.alive == false)) {
            catAliveProbability = 0;
        }
        if ((cat.alive == true) && (opened == false)) {
            catAliveProbability = 50;
        }
        System.out.println("Cat Alive Probability: " + catAliveProbability);
    }

    public void openBox() {
        opened = true;
        System.out.println("Box is opened!");
        Random random = new Random();
        int deathProbability = random.nextInt(101);
        if (deathProbability > 50) {
            cat.alive = false;
        } else cat.alive = true;
        System.out.println("Death Probability: " + deathProbability + "\n" + "Cat is alive? " + cat.alive);
    }

    @Override
    public String toString() {
        return "Name: " + cat.getName() + " Age: " + cat.getAge() + " Height: " + cat.getHeight() + " IsAlive? - " + cat.isAlive();
    }
}
