package com.java_book;

class Player {
    int number = 0;
    void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("Думаю, что число - " + number);
    }
}