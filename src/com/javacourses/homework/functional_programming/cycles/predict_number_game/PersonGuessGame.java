package com.javacourses.homework.functional_programming.cycles.predict_number_game;

import java.util.Random;
import java.util.Scanner;

public class PersonGuessGame {
    Person person;

    public PersonGuessGame(Person person) {
        this.person = person;
    }

    public void guessNumber() {
        Random random = new Random();
        final int systemNumber = random.nextInt(1024) + 1;
        System.out.println("System's number to guess: " + systemNumber);
        Scanner scanner = new Scanner(System.in);
        int k = 10;

        while (k > 0) {
            System.out.println( k + " Attempts left" + "\n" + "Insert your number from 1 to 1024");
            while (!scanner.hasNextInt()) {
                scanner.next();
            }
            person.setGuessNumber(scanner.nextInt());
            if (person.getGuessNumber() < systemNumber) {
                System.out.println("Greater");
            } else if (person.getGuessNumber() > systemNumber) {
                System.out.println("Less");
            } else {
                System.out.println("Success!" +
                        "\n" + "Person's number: " + person.getGuessNumber() +
                        "\n" + "System Number: " + systemNumber);
                break;
            }
            k--;
            if(k == 0){
                System.out.println("Sorry, you lose, no attempts left :( " +
                        "\n" + "System's number: " + systemNumber );
            }
        }
    }
}