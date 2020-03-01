package JavaCourses.Functional;

public class MathTable {
    public static void main(String[] args) {
        tableIncrease();

    }


    private static void tableIncrease() { //11. Циклами вывести на экран всю таблицу умножения в виде
        int result;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
    }
}
