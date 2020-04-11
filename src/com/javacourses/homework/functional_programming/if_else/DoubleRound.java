package com.javacourses.homework.functional_programming.if_else;

import java.util.Scanner;

//Программа, округляющая введённый double

public class DoubleRound {
    public static void main(String[] args) {
        System.out.println("Введите добное число в формате xx,x"); // xx.x не воспринимает как дабл
        Scanner sc = new Scanner(System.in);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.println("Введите добное число в формате xx,x");
        }
        double input = sc.nextDouble();
        System.out.println("Введенное число: " + input);
        int finalInput;
        if (input >= 0){
            finalInput =(int) (input + 0.5);
        }else{
            finalInput =(int) (input - 0.5);
        }
        System.out.println("Округленное число: " + finalInput);
    }
}
