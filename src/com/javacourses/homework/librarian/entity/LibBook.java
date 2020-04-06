package com.secourse.librarian.entity;

import com.secourse.librarian.tool.IdGenerator;

import java.util.Comparator;

public class LibBook extends Book {
    public final long ID = IdGenerator.nextId();
    public static final Comparator<LibBook> COMPARATOR_BY_DATE = new Comparator<LibBook>() {
        @Override
        public int compare(LibBook o1, LibBook o2) {
            return o1.getDate().compareTo(o2.getDate());
        }
    };

    public LibBook(Book book) {
        super(book.getTitle(), book.getAuthor(), book.getDate());
    }

}
