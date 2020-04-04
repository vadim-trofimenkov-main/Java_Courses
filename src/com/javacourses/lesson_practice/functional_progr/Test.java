package com.javacourses.lesson_practice.functional_progr;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите положительное число");
        while ( !sc.hasNextInt() ) {
            sc.next();
            System.out.println("Введите положительное число ");
        }
        int number = sc.nextInt();
        while (number < 0) {
            System.out.println("Ошибка, введите пожалуйста положительное число");
            while ( !sc.hasNextInt() ) {
                sc.next();
                System.out.println("Введите положительное число ");
            }
            number = sc.nextInt();
        }
        System.out.println(number);
    }
}
