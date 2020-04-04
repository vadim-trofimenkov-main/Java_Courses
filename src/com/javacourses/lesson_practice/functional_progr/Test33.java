package com.javacourses.lesson_practice.functional_progr;

import java.util.Random;
import java.util.Scanner;

public class Test33 {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        randomArray(array);
        printArray(array);
        System.out.println();
        printnArrayPlusTree(array);
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void printnArrayPlusTree(int[] array) {
        int[] newarray = new int[array.length];
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Введите число на которое хотите увеличить массив");
        }
        int increase = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i]+increase;
        }
        printArray(newarray);
    }

    private static void randomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }
}
