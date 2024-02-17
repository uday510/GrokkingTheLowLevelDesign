package DesignProblems.LibraryManagementSystem.member;

public class Account {
    private String accountId;
    private MemberType memberType;

    public Account(String accountId, MemberType memberType) {
        this.accountId = accountId;
        this.memberType = memberType;
    }

    public String getAccountId() {
        return accountId;
    }

    public MemberType getMemberType() {
        return memberType;
    }
}
