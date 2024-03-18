package Trash.DesignPatterns.DesignProblems.LibraryManagementSystem.transaction;

public class Fine {
    private String fineId;
    private double amount;
    private FineStatus fineStatus;
    private BookLending relatedLending;

    public Fine(String fineId, double amount, FineStatus fineStatus, BookLending relatedLending) {
        this.fineId = fineId;
        this.amount = amount;
        this.fineStatus = fineStatus;
        this.relatedLending = relatedLending;
    }
}
