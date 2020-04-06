package com.secourse.librarian.library;

import com.secourse.librarian.entity.Book;
import com.secourse.librarian.entity.LibBook;
import com.secourse.librarian.tool.LibUtil;

import java.util.*;

public class Library {
    final Map<Long, LibBook> ALL_BOOKS = new HashMap<>();
    final Map<String, List<LibBook>> BOOKS_BY_AUTHORS = new HashMap<>();

    public Collection<LibBook> viewAllBooks() {
        return LibUtil.getUnmodifiableVersion(ALL_BOOKS.values());
    }

    public List<LibBook> getByAuthor(String author) {
        List<LibBook> books = BOOKS_BY_AUTHORS.get(author);
        return LibUtil.getUnmodifiableVersion(books);
    }

    public LibBook find(Book book) {
        Collection<LibBook> books = ALL_BOOKS.values();
        String author = book.getAuthor();
        Date date = book.getDate();
        String title = book.getTitle();
        for (LibBook libBook : books) {
            if (author.equals(libBook.getAuthor()) && date.equals(libBook.getDate()) && title.equals(libBook.getTitle())) {
                return libBook;
            }
        }
        return null;
    }

    static class LibrarySortedList extends ArrayList<LibBook> {
        private Comparator<LibBook> comparator;

        public LibrarySortedList(Comparator<LibBook> comparator) {
            this.comparator = comparator;
        }

        @Override
        public boolean add(LibBook book) {
            boolean add = super.add(book);
            sort(comparator);
            return add;
        }
    }

}
