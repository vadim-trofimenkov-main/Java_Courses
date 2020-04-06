package com.secourse.librarian.tool;

public class IdGenerator {
    private static long lastId = 1111110;

    public static long nextId() {
        return ++lastId;
    }
}
