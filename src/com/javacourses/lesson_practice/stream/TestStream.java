package com.javacourses.lesson_practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(127, 128, 129, -128, -129, -127, 9999, 1200, 12);
        integers.stream()
                .filter((integer -> integer < 128 && integer >= -127))
                .map((Integer::byteValue))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}