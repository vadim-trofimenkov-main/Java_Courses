package JavaCourses.Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask {
    // random(int[] array)  - заполнить массив случайными десятью числами от 0 до 9.
    // getMaxEvenElement(int[] array) - получить максимальный четный элемент массива
    // getMinNotEvenElement(int[] array) - получить минимальный нечетный элемент массива
    // get2Min(int[] array) - получить 2 минимальных элемента массива
    // newArrayInSecondRate(int[] array) - получить новый массив со значниями старого массиива во 2-ой степени
    // revertArray(int[] array) - Перевернуть массив
    // getAverageElementAndElementsLessAverage(int[] array) - Получить среднее арифметическое всех чисел массива и найти
    // все элементы меньше его
    // getMaxElement(int[] array) - получить максимальный элемент массива
    // getMinElement(int[] array) - получить минимальный элемент массива
    // getAllElementsBetweenMaxAndMin(int[] array) - Получить все элементы между максимальным и минимальным элементами
    private static final int[] ARRAY = new int[10];

    public static void main(String[] args) {
        random(ARRAY);
        getAllElementsBetweenMaxAndMin(ARRAY);
    }

    private static int[] random(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        return array;
    }

    private static void getMaxEvenElement(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (max < value && value % 2 == 0) {
                max = value;
            }
        }
        System.out.println("Максимальное четное число массива: " + max);
    }

    private static void getMinNotEvenElement(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (min > value && value % 2 != 0) {
                min = value;
            }
        }
        System.out.println("Минимальное нечетное число массива: " + min);
    }

    private static void get2Min(int[] array) {
        int min1 = 0;
        int min2 = 1;
        for (int i = 0; i < array.length; i++) {
            if (array[min1] > array[i]) {
                min1 = i;
            }
        }
        int temp = array[0];
        array[0] = array[min1];
        array[min1] = temp;
        for (int i = 1; i < array.length; i++) {
            if (array[min2] > array[i]) {
                min2 = i;
            }
        }
        System.out.println("Два минимальных числа в массиве: " + array[0] + " и " + array[min2]);
    }

    private static void newArrayInSecondRate(int[] array) {
        int[] newarray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarray[i] = array[i] * array[i];
            System.out.print(newarray[i] + " ");
        }
    }

    private static void revertArray(int[] array) {
        int temp;
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void getAverageElementAndElementsLessAverage(int[] array) {
        int summ = 0;
        int average;
        for (int i = 0; i < array.length; i++) {
            summ += array[i];
        }
        average = summ / array.length;
        System.out.println("Сумма всех чисел массива равна: " + summ);
        System.out.println("Среднее арифметическое всех чисел массива равна: " + average);
        System.out.print("Элементы массива, которые меньше среднего: ");
        for (int value : array) {
            if (value < average) {
                System.out.print(value + " ");
            }
        }
    }

    private static int getMaxElement(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[max] < array[i]) {
                max = i;
            }
        }
        System.out.println("Максимальное число массива: " + array[max]);
        return max;
    }

    private static int getMinElement(int[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[min] > array[i]) {
                min = i;
            }
        }
        System.out.println("Минимальное число массива: " + array[min]);
        return min;
    }

    private static void getAllElementsBetweenMaxAndMin(int[] array) {
        int max = getMaxElement(ARRAY);
        int min = getMinElement(ARRAY);
        System.out.print("Элементы находящиеся между максимальным и минимальным элементами: ");
        for (int i = 0; i < array.length; i++) {
            if (min < i && i < max) {
                System.out.print(array[i] + " ");
            } else if (min > i && i > max) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
