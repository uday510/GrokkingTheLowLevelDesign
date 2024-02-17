package DesignProblems.LibraryManagementSystem.book;

public class BookItem {
    private String barcode;
    private Book book;
    private BookStatus status;

    public BookItem(String barcode, Book book, BookStatus status) {
        this.barcode = barcode;
        this.book = book;
        this.status = status;
    }
}
