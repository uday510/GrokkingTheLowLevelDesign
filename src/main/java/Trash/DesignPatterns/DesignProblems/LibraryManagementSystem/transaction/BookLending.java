package Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.transaction;

import Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.book.BookItem;
import Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.member.Member;

import java.util.Date;

public class BookLending {
    private String lendingId;
    private Date lendingDate;
    private Date dueDate;
    private Date returnDate;
    private BookItem lentBookItem;
    private Member lendingMember;

    public boolean lendBook(BookItem bookItem, Member member) {
        this.lentBookItem = bookItem;
        this.lendingMember = member;
        this.lendingDate = new Date();
        this.dueDate = new Date(lendingDate.getTime() + 14*24*60*60*1000);
        return true;
    }
}
