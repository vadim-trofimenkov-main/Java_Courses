package com.javacourses.homework.functional_programming.cycles;
//Нарисовать фигуру 5х5
//* o o o *
//o o o o o
//o o * o o
//o o o o o
//* o o o *
//используя вложенный цикл
public class Figure {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                if ((j == 0 || j== 4) && (i == 0 || i==4) || (j == 2 && i == 2)) {
                    System.out.print(" * ");
                }else System.out.print(" 0 ");
            }
            System.out.println(" ");
        }
    }
}
