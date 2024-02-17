package DesignProblems.LibraryManagementSystem.catalog;

import DesignProblems.LibraryManagementSystem.book.Book;

import java.util.List;

public class Catalog {
    private String name;
    private List<Book> books;

    public Catalog(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }
}
