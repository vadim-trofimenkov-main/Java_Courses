package com.javacourses.homework.functional_programming.cycles.predict_number_game;

public class Main {
    public static void main(String[] args) {
        PersonGuessGame personGuessGame = new PersonGuessGame(new Person("Вася"));
        personGuessGame.guessNumber();
    }
}