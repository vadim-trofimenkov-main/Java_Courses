package com.javacourses.homework.functional_programming.cycles;
//Вывести последовательность Фибоначчи
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < 20; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
