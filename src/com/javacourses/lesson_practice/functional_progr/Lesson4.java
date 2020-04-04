package com.javacourses.lesson_practice.functional_progr;

import java.util.Random;

public class Lesson4 {
    public static void main(String[] args) {
        int[][] doublearray = new int[5][5];
        randomDoubleArray(doublearray);
        printArray(doublearray);
        System.out.println();
        int[][] seconddoublearray = new int[5][5];
        for (int i = 0; i < doublearray.length; i++) {
            for (int j = 0; j < doublearray[i].length; j++) {
                seconddoublearray[i][j] = doublearray[i][j] * doublearray[i][j];
            }
        }
        printArray(seconddoublearray);
        System.out.println();
        int[][] thirdDoubleArray = new int[5][5];
        for (int i = 0; i < doublearray.length; i++) {
            for (int j = 0; j < doublearray[i].length; j++) {
                thirdDoubleArray[i][j] = doublearray[i][j] + seconddoublearray[i][j];
            }
        }
        printArray(thirdDoubleArray);
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
    private static void randomDoubleArray( int[][] doublearray){
        Random random = new Random();
        for (int i = 0; i <doublearray.length; i++) {
            for (int j = 0; j < doublearray[i].length; j++) {
                doublearray[i][j] = random.nextInt(10)+1;
            }
        }
    }
}
