package com.my_test_package;

import java.util.Arrays;

public class MinDar {
    public static void main(String[] args) {
        final int[] m = {1, 6, 5, 1, 3, 8};
        int min1 = 0;
        int min2 = 1;
        for (int i = 0; i < m.length; i++) {
            if (m[i] < m[min1]) {
                min1 = i;
            }
        }
        int temp = m[min1];
        m[min1] = m[0];
        m[0] = temp;

        System.out.println(Arrays.toString(m));

        for (int i = 1; i < m.length; i++) {

            if (m[i] < m[min2]) {
                min2 = i;
            }
        }
        System.out.println("Индекс мин элемента: " + min1 + " " + "Значение мин элемента: " + temp);
        System.out.println("Индекс 2го мин элемента: " + min2 + " " + "Значение 2го мин элемента: " + m[min2]);
    }
}

