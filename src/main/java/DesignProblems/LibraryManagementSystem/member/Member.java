package DesignProblems.LibraryManagementSystem.member;

public class Member {
    private String memberId;
    private String name;
    private String email;
    private Account account;
    private LibraryCard libraryCard;

    public Member(String memberId, String name, String email, Account account, LibraryCard libraryCard) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.account = account;
        this.libraryCard = libraryCard;
    }

    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }
}
