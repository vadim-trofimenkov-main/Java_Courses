package com.javacourses.homework.functional_programming.cycles;
//14. Прога которая выдаст каким веком является введенный год.(для усложнения пусть считает в том числе "до н.э.")
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
