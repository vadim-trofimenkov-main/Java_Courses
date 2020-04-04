package com.javacourses.homework.functional_programming.cycles;

//11. Циклами вывести на экран всю таблицу умножения в виде
//1х1=1
//1х2=2
//....
//9х9=81

public class MathTable {
    public static void main(String[] args) {
        tableIncrease();

    }


    private static void tableIncrease() {
        int result;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
    }
}
