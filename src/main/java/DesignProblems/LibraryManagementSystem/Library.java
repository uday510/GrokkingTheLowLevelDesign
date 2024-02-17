package DesignProblems.LibraryManagementSystem;

import DesignProblems.LibraryManagementSystem.author.Author;
import DesignProblems.LibraryManagementSystem.book.Book;
import DesignProblems.LibraryManagementSystem.catalog.Catalog;
import DesignProblems.LibraryManagementSystem.member.LibraryCard;
import DesignProblems.LibraryManagementSystem.member.Member;
import DesignProblems.LibraryManagementSystem.rack.Rack;
import DesignProblems.LibraryManagementSystem.transaction.BookLending;
import DesignProblems.LibraryManagementSystem.transaction.BookReservation;
import DesignProblems.LibraryManagementSystem.transaction.Fine;

import java.util.List;

public class Library {
    private String name;
    private String address;
    private List<Book> books;
    private List<Member> members;
    private List<LibraryCard> libraryCards;
    private List<BookReservation> bookReservations;
    private List<BookLending> bookLendings;
    private List<Author> authors;
    private List<Fine> fines;
    private List<Rack> rack;
    private List<Catalog> catalogs;

    public Library(String name, String address, List<Book> books, List<Member> members,
                   List<LibraryCard> libraryCards, List<BookReservation> bookReservations,
                   List<BookLending> bookLendings, List<Author> authors, List<Fine> fines,
                   List<Rack> rack, List<Catalog> catalogs) {
        this.name = name;
        this.address = address;
        this.books = books;
        this.members = members;
        this.libraryCards = libraryCards;
        this.bookReservations = bookReservations;
        this.bookLendings = bookLendings;
        this.authors = authors;
        this.fines = fines;
        this.rack = rack;
        this.catalogs = catalogs;
    }



}
