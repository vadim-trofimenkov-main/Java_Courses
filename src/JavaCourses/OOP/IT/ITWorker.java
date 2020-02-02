package JavaCourses.OOP.IT;

public class ITWorker implements ICoffeeMaker {

    @Override
    public void makeCoffee() {
        System.out.println("Вот ваш Кофе, сэр");
    }
}
