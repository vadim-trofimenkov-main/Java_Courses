package com.javacourses.homework.functional_programming.cycles;
//Перемножить все цифры числа
import java.util.Arrays;
import java.util.Scanner;

public class NumberMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Введите целое положительное число");
        }
        int input = scanner.nextInt();
        while (input < 0) {
            System.out.println("Введите целое положительное число");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Введите целое положительное число");
            }
            input = scanner.nextInt();
        }
        String newinput = String.valueOf(input);
        int [] massiveinput = new int[newinput.length()];
        for (int i = 0; i < newinput.length() ; i++) {
            massiveinput[i] = input%10;
            input/=10;
        }
        System.out.println("Наше число равно: " + Arrays.toString(massiveinput));
        int multiply = 1;
        for (int i = 0; i < massiveinput.length ; i++) {
            multiply *= massiveinput[i];
        }
        System.out.println("Произведение цифр введенного числа равно: " + multiply);
    }
}

