package com.my_test_package;
import java.util.Arrays;
import java.util.Random;
public class MinrevertMAx {
        public static void main(String[] args) {
            int[] myarray = new int [10];
            Random rand = new Random();
            for (int i = 0; i < myarray.length; i++) {
                myarray[i] = rand.nextInt(100);
            }
            System.out.println(Arrays.toString(myarray));
            int max = 0;
            int min = 0;
            for (int j = 0; j < myarray.length ; j++) {
                if (myarray[j] > myarray[max] ) {
                    max = j;
                } else if ( myarray[j] < myarray[min] ) {
                    min = j;
                }
            }
            System.out.println("Минимальный элемент равен: " + myarray[min]);
            System.out.println("Индекс минимального элемента равен: " + min);
            System.out.println("Максимальный элемент равен: " + myarray[max]);
            System.out.println("Индекс максимального элемента равен: " + max);
            int temp = myarray[max];
            myarray[max] = myarray[min];
            myarray[min] = temp;
            System.out.println(Arrays.toString(myarray));
        }
    }

