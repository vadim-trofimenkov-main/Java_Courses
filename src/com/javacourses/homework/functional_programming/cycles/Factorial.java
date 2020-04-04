package com.javacourses.homework.functional_programming.cycles;
//Вычислить факториал числа
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Введите число от которого нужно взять факториал");
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введите число от которого нужно взять факториал");
        }
        int input = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= input; i++) {
            factorial = factorial * i;
        }
        System.out.println("Введенное число:" + input);
        System.out.println("Факториал числа:" + factorial);
    }
}