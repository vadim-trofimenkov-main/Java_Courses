package com.my_test_package;
import java.util.Arrays;
import java.util.Random;
public class Rervers {
    public static void main (String[] args) {
        int[] myarray = new int[10];
        Random rand = new Random();
        for (int i = 0; i < myarray.length ; i++) {
            myarray[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(myarray));
        for (int j = 0, k = myarray.length - 1; j < k; j++, k--) {
            int temp = myarray[j];
            myarray[j] = myarray[k];
            myarray[k] = temp;
        }
        System.out.println(Arrays.toString(myarray));
    }
}
