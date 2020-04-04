package com.javacourses.homework.functional_programming.cycles;
//Циклом вывести на экран весь латинский алфавит
public class Alphabet {
    public static void main(String[] args) {
        for (int i = '\u0041'; i <= '\u005A'; i++) {
            char a = (char) i;
            System.out.print( a + " ");
        }
    }
}
