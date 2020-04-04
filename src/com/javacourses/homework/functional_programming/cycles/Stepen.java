package com.javacourses.homework.functional_programming.cycles;
//Написать алгоритм возведения в степень. Пользователь первым действием вводит число, которое возводится в степень, вторым действием - в какую степень.
//	Оба числа должны быть положительны и целочисленны
import java.util.Scanner;

public class Stepen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число,которое хотите возвести в степень");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введите число,которое хотите возвести в степень");
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
        System.out.println("Введите степень, в которую хотите возвести число");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Введите степень, в которую хотите возвести число");
        }
        int rank = sc.nextInt();
        while (rank < 0) {
            System.out.println("Ошибка, введите пожалуйста положительную степень");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Введите положительное число ");
            }
            rank = sc.nextInt();
        }
        System.out.println("Число: " + number);
        System.out.println("Степень " + rank);
        int numberinrank = 1;
        for (int i = 0; i < rank; i++) {
            numberinrank = numberinrank*number;
        }
        System.out.println(number + " в степени " + rank + " равно "  + numberinrank);
    }
}
