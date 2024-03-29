package Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.transaction;

import Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.book.BookItem;
import Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.member.Member;

import java.util.Date;

public class BookReservation {
    private String reservationId;
    private Date reservationDate;
    private BookItem reservedBookItem;
    private Member reservingMember;

    public BookReservation(String reservationId, Date reservationDate, BookItem reservedBookItem, Member reservingMember) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.reservedBookItem = reservedBookItem;
        this.reservingMember = reservingMember;
    }
}
