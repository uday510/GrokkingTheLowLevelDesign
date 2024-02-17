package DesignProblems.LibraryManagementSystem.notification;

import DesignProblems.LibraryManagementSystem.member.Member;

public class Notification {
    private String notificationId;
    private String content;
    private Member targetMember;


    public Notification(String notificationId, String content, Member targetMember) {
        this.notificationId = notificationId;
        this.content = content;
        this.targetMember = targetMember;
    }
}
