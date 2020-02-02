package JavaCourses.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    private static final int ARRAYLENGTH = randomArrayLength();
    private static final int[] ARRAY = new int[ARRAYLENGTH];

    public static void main(String[] args) {
        changeIndexToElement();
        randomArrayInput(ARRAY);
        everyArrayElementMinus4(ARRAY);
        arrayPrintFromTheBack(ARRAY);
        rewriteArray(ARRAY);
    }

    private static int randomArrayLength() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Ошибка, введите число");
        }
        return scanner.nextInt();
    }

    private static int[] randomArrayInput(int[] array) {
        Random random = new Random();
        System.out.print("Рандомный массив: ");
        for (int i = 0; i < array.length; i++) {
            while (array[i] % 2 == 0) {
                array[i] = random.nextInt(50);
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static int[] arrayPrint(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        return array;
    }

    private static int[] arrayPrintFromTheBack(int[] array) {
        System.out.print("Обратный массив: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static int[] everyArrayElementMinus4(int[] array) {
        System.out.print("Новый массив уменьшенный на 4: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - 4;
            System.out.print( array[i] + " ");
        }
        System.out.println();
        return array;
    }
    private static int[] rewriteArray(int[] array) {
        int[] newarray = new int[array.length];
        System.out.print("Переписанный массив: ");
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i];
            System.out.print(newarray[i] + " ");
        }
        System.out.println();
        return newarray;
    }
    private static void changeIndexToElement() {
        int[] array1 = {4, 2, 0, 1, 3};
        int[] array2 = new int[array1.length];
        int index1;
        int index2;
        for (int i = 0; i < array1.length; i++) {
            array2[array1[i]] = i;
            System.out.print(array2[i] + " ");
        }
        System.out.println();
    }
}