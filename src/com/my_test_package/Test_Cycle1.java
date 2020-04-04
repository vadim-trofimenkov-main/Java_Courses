package com.my_test_package;

public class Test_Cycle1 {
    public static void main(String[] arg) {
        int[] arr = {1,2,3};
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while(i > 0) ;
    }
}
