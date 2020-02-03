package JavaCourses.Functional;

import java.util.Scanner;

public class Calculator {
    private static final char[] OPERATIONS = {'+', '*', '-', '/'};
    private static final double[] RESULT_HISTORY = new double[500];
    private static int historyLastInsert = 0;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double result;
        while (true) {
            double value1 = getValueFromConsole();
            char operation = getOperationFromConsole();
            double value2 = getValueFromConsole();
            result = calculate(value1, value2, operation);
            System.out.println(result);
            addResult(result);
        }
    }

    private static void addResult(double result) {
        RESULT_HISTORY[historyLastInsert] = result;
        historyLastInsert++;
    }

    private static double calculate(double value1, double value2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = value1 + value2;
                break;
            case '-':
                result = value1 - value2;
                break;
            case '*':
                result = value1 * value2;
                break;
            case '/':
                result = value1 / value2;
                break;
            default:
                throw new RuntimeException("Critical exception with operation impl");
        }
        return result;
    }

    private static double getValueFromConsole() {
        while (!scanner.hasNextDouble()) {
            String input = scanner.next();
            checkInput(input);
        }
        double value = scanner.nextDouble();
        return value;
    }

    private static char getOperationFromConsole() {
        while (true) {
            String input = scanner.nextLine();
            checkInput(input);
            if (input.length() == 1) {
                char inputChar = input.charAt(0);
                boolean validOperation = contains(OPERATIONS, inputChar);
                if (validOperation) {
                    return inputChar;
                }
            }
        }
    }

    private static void checkInput(String input) {
        checkExit(input);
        checkShowResult(input);
    }

    private static void checkShowResult(String input) {
        if (input.equals("history")) {
            printArray(RESULT_HISTORY, historyLastInsert);
        }
    }

    private static void checkExit(String input) {
        if (input.equals("Exit")) {
            System.exit(0);
        }
    }

    private static boolean contains(char[] array, char c) {
        for (char value : array) {
            if (value == c) {
                return true;
            }
        }
        return false;
    }

    private static void printArray(double[] array, int indexToStop) {
        for (int i = 0; i < indexToStop; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }
}
