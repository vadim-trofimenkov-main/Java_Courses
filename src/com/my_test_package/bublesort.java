package com.my_test_package;
import java.util.Arrays;
import java.util.Random;
public class bublesort {
    public static void main(String[] args) {
        int[] myarray = new int[10];
        Random rand = new Random();
        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = rand.nextInt(100);
        }
        System.out.println(Arrays.toString(myarray));
        bubblesort(myarray);
    }

    private static void bubblesort(int[] newarray) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int j = 1; j < newarray.length; j++) {
                if (newarray[j - 1] > newarray[j]) {
                    int temp = newarray[j];
                    newarray[j] = newarray[j - 1];
                    newarray[j - 1] = temp;
                    isSorted = false;
                }
            }
            System.out.println(Arrays.toString(newarray));
        }
    }
}
