package com.javacourses.homework.functional_programming.cycles;

//7. Пользователь вводит n чисел, считается сумма введенных отрицательных чисел, произведение нечетных и минимальное введенное число

import java.util.Arrays;
import java.util.Scanner;

public class SummMultMin {
    public static void main(String[] args) {
        int summ = 0;
        int multiply = 1;
        int min;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во чисел");
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.println("Ошибка, введите кол-во чисел(целое число)");
        }
        int n = sc.nextInt();
        while (n <= 0) {
            System.out.println("Введите кол-во чисел(целое положительное число)");
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Ошибка, введите кол-во чисел(целое положительное число)");
            }
            n = sc.nextInt();
        }
        int[] array = new int[n];
        System.out.println("Введите целое число");
        for (int i = 0; i < array.length; i++) {
            while (!sc.hasNextInt()) {
                sc.next();
                System.out.println("Ошибка, введите целое число");
            }
            System.out.println("Введите следующее число");
            array[i] = sc.nextInt();
        }
        min = array[0];
        for (int value : array) {
            if (value < 0) {
                summ += value;
            } else if (value % 2 != 0) {
                multiply *= value;
            }
        }
        for (int value: array){
            if (min > value) {
                min = value;
            }
        }
            System.out.println(Arrays.toString(array));
            System.out.println("Сумма введённых отрицательных чисел равна: " + summ);
            System.out.println("Произведение нечётных чисел равно: " + multiply);
            System.out.println("Минимальное введённое число равно: " + min);
    }
}
