package com.javacourses.homework.file;

import java.io.*;
import java.util.Scanner;

public class FileTask {
    public static void main(String[] args) {
        textToConsole(new File("copyTestFile.txt"));

    }

    private static void insertText() {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        try (FileWriter writer = new FileWriter("copyTestFile.txt")) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void textToConsole(File file) {
        try (Scanner scanner = new Scanner(file); FileReader fileReader = new FileReader(file); FileWriter writer = new FileWriter("copyTestFile.txt")) {
            char[] text = new char[128];
            while (fileReader.read(text) > 0) ;
            writer.write(text);
            System.out.println(text);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
