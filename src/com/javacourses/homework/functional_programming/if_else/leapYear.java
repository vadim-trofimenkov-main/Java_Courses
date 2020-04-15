package com.javacourses.homework.functional_programming.if_else;

import java.util.Scanner;
//Пользователь вводит год, программа пишет является ли год високосным
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введите год");
        }
        int input = sc.nextInt();
        System.out.println("Введенный год: " + input);
        if (input % 4 != 0) {
            System.out.println("Невисокосный");
        } else if (input % 100 == 0) {
            if (input % 400 == 0) {
                System.out.println("Високосный");
            } else System.out.println("Невисокосный");
        } else System.out.println("Високосный");
    }
}
