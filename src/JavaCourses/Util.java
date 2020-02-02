package JavaCourses;

import java.util.Random;
import java.util.Scanner;

public class Util {
    public static int insertIntMore0() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Введите целое число");
        }
        int input = scanner.nextInt();
        while (input < 0) {
            System.out.println("Введите положительное число");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Введите целое число");
            }
            input = scanner.nextInt();
        }
        return input;
    }
    public static int RandomFrom1to100(){
        Random random = new Random();
        int value = random.nextInt(101);
        return value;
    }

    public static void arrayRandom(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
    }

    public static void doubleArrayRandom(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            arrayRandom(array[i]);
        }
    }

    public static void printArray(int[] array) {
        for (Object value : array) {
            System.out.print(value + "\t");
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
            System.out.println();
        }
    }

    public static int getMaxElement(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[max] < array[i]) {
                max = i;
            }
        }
        System.out.println("Максимальное число массива: " + array[max]);
        return array[max];
    }

    public static int getMinElement(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }
        System.out.println("Минимальное число массива: " + array[min]);
        return array[min];
    }

    public static int getSummArrayValue(int[] array) {
        int summ = 0;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        return summ;
    }
}