package Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.book;

import Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.author.Author;

import java.util.List;

public class Book {
    private String ISBN;
    private String title;
    private String subject;
    private String publishers;
    private List<BookItem> bookItems;
    private List<Author> authors;

    public Book(String ISBN, String title, String subject, String publishers, List<BookItem> bookItems, List<Author> authors) {
        this.ISBN = ISBN;
        this.title = title;
        this.subject = subject;
        this.publishers = publishers;
        this.bookItems = bookItems;
        this.authors = authors;
    }
}
