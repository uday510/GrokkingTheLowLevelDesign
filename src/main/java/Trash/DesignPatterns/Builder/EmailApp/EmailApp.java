package Trash.DesignPatterns.Builder.EmailApp;

import Trash.DesignPatterns.Builder.EmailApp.email.Email;

public class EmailApp {

    public static void main(String[] args) {
        Email email = Email.builder()
                .setSubject("Meeting Agenda")
                .setSender("john.doe@example.com")
                .setBody("Hi Team, \n\nLet's meet at 10:00 AM tomorrow to discuss the agenda for the upcoming sprint. \n\nThanks, \nJohn Doe")
                .setRecipient("john.doe@example.com")
                .build();

        System.out.println(email);
    }
}
