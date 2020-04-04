package com.javacourses.lesson_practice.functional_progr;

import java.util.Scanner;

public class Swichtask {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        String inputStr = src.nextLine();
        int inputLength = inputStr.length();
        if (inputLength == 1) {
            char input = inputStr.charAt(0);
            if (input == 'D' || input == 'd') {
                System.out.println("Deleted");
            } else if (input == 'N' || input == 'n') {
                System.out.println("OK");
            } else {
                System.out.println("Unknown command");
            }
        } else {
            System.out.println("Неправильная команда");
        }
    }
}
