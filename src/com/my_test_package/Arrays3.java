package com.my_test_package;
import java.util.Arrays;
import java.util.Random;
public class Arrays3 {
    public static void main(String[] args) {
        int[] first = new int [5];
        int[] second = new int [5];
        int[] third = new int [10];
        System.out.println(Arrays.toString(third));
      Random rand = new Random();
        for (int i = 0; i < first.length ; i++) {
            first[i] = rand.nextInt(10);
                    third[i] = first[i];
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(third));
        for (int j = 0; j < second.length ; j++) {
            second[j] = rand.nextInt(10);
        }
            for (int k = 5, j = 0; k < third.length ; k++, j++) {
            third[k] = second[j];
            }
        System.out.println(Arrays.toString(second));
        System.out.println(Arrays.toString(third));
    }
}
