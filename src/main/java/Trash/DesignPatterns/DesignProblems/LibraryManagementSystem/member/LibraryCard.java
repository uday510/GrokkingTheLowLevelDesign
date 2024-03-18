package Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.member;

public class LibraryCard {
    private String cardNumber;
    private Account account;

    public LibraryCard(String cardNumber, Account account) {
        this.cardNumber = cardNumber;
        this.account = account;
    }
}
