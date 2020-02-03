package JavaCourses.Functional;

import java.util.Scanner;

public class Numberlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введите число");
        }
        int input = sc.nextInt();
        System.out.println( input);
        String newinput = String.valueOf(input);
        int inputlength = newinput.length();
        System.out.println("Наше число: " + newinput);
        System.out.println("Количество цифр нашего числа: " + inputlength);
    }
}
