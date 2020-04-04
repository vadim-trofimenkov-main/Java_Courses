package com.my_test_package;
import java.util.Arrays;
public class Min2 {
public static void main(String[] args) {
    int[] myarray = {1, 2, 3, 4, 5} ;
    System.out.println(Arrays.toString(myarray));
    int min1 = myarray[0];
    int min2 = myarray[0];
    int min3 = myarray[0];
    int indexmin1 = 0;
    int indexmin2 = 0;
    int indexmin3 = 0;
    for (int i = 1; i < myarray.length; i++) {
        if(myarray[i] < min1) {
            min3 = min2;
            min2  =min1;
            min1 = myarray[i];
            indexmin1 = i;
        } else if(myarray[i] < min2){
            min3 = min2;
            min2 = myarray[i];
            indexmin2 = i;
        } else if(myarray[i] < min3){
            min3 = myarray[i];
            indexmin3 = i;
        }
    }
    System.out.println("Первый минимальный элемент: " + min1);
    System.out.println("Индекс первого минимального элемента: " + indexmin1);
    System.out.println("Второй минимальный элемент: " + min2);
    System.out.println("Индекс второго минимального элемента: " + indexmin2);
    System.out.println("Третий минимальный элемент: " + min3);
    System.out.println("Индекс третьего минимального элемента: " + indexmin3);
}
}
