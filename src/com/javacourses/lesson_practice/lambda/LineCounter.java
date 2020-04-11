package com.javacourses.lesson_practice.lambda;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LineCounter {
    public static long linesCount(File file, String excludeEquals, String... excludeContains) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        long count = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (!line.equals(excludeEquals) && !containsAny(line, excludeContains)) {
                count++;
            }
        }
        return count;
    }

    private static boolean containsAny(String line, String... toContains) {
        for (String containLine : toContains) {
            if (line.contains(containLine)) {
                return true;
            }
        }
        return false;
    }
}