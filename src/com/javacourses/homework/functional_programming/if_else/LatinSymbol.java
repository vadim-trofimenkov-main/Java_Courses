package com.javacourses.homework.functional_programming.if_else;

import java.util.Scanner;

//Пользователь вводит символ и программа должна понять, символом какого регистра является инпут
public class LatinSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите один символ латинского алфавита");
        String input = sc.nextLine();
        while ((input.length() != 1) | (!input.matches("[a-zA-Z]"))) {
            System.out.println("Введите один символ ");
            input = sc.nextLine();
        }
        char letter = input.charAt(0);
        if(Character.isLowerCase(letter)){
            System.out.println("Буква: " + input + '\n' + "Регистр: нижний");
        }else{
            System.out.println("Буква: " + input + '\n' + "Регистр: верхний");
        }
    }
}
