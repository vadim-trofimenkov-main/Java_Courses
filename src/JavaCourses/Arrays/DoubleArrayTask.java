package JavaCourses.Arrays;

import JavaCourses.Functional.Util;

public class DoubleArrayTask extends Util {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        printDouble(array);
    }

    public static void summFirstLastLine(int[][] array) {
        int summFirstLine = getSummArrayValue(array[0]);
        int summLastLine = getSummArrayValue(array[array.length - 1]);
        System.out.println("Сумма первой строки двумерного массива равна: " + summFirstLine);
        System.out.println("Сумма последней строки двумерного массива равна: " + summLastLine);
    }

    public static void printDoubleArrayWithStars() {
        String[][] array = new String[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i == 0 || i == array.length - 1) && (j == 0 || j == array[i].length - 1)) {
                    array[i][j] = " 0 ";
                } else if (i == array.length / 2 && j == array.length / 2) {
                    array[i][j] = " 0 ";
                } else array[i][j] = " * ";
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    public static void printDoubleArray1() {
        int[][] finalArray = new int[5][5];
        int[][] array = new int[5][5];
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1 - i; j >= 0; j--) {
                array[i][j] = j + 1;
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int[][] array1 = new int[5][5];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length - i; j++) {
                array1[i][j] = j + 1;
                System.out.print(array1[i][j]);
            }
            System.out.println();
        }
    }

    public static int getMaxDoubleArrayDiagonalValue(int[][] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    newArray[i] = array[i][j];
                }
            }
        }
        return getMaxElement(newArray);
    }

    public static void printDouble(int[][] array) {
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
