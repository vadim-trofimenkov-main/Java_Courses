package com.my_test_package;
import java.util.Arrays;;
public class Min2My {
    public static void main(String[] args) {
        int [] myarray = {20, 4, 7, 10, 11, 30};
        int min1 = 0;
        int min2 = 0;
        for (int i = 0; i < myarray.length ; i++) {
            if ( myarray[i] < myarray[min1])  {
                min1 = i;
            }  else if ( myarray[i] < myarray[min2] ) {
                min2 = i;
            }
        }
        System.out.println(Arrays.toString(myarray));
        System.out.println("Индекс первого минимального элемента равен: " + min1);
        System.out.println("Первый минимальный элемент равен: " + myarray[min1]);
        System.out.println("Индекс второго минимального элемента равен: " + min2);
        System.out.println("Первый минимальный элемент равен: " + myarray[min2]);
    }
}
