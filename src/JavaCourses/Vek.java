package JavaCourses;

import java.util.Random;
import java.util.Scanner;

public class Vek {
    public static void main(String[] args) {
        System.out.println("Введите год");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введите год");
        }
        int input = sc.nextInt();
        if (input < 0) {
            input = input/-100 +1;
            System.out.println(input + " век до н э");
        } else if (input == 0.0) {
            System.out.println("Иесус родился");
        } else {
            input = input/100 + 1;
            System.out.println(input + " век");
        }
    }
}
