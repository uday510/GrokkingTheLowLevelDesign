package DesignPatterns.Builder.EmailApp.email;

import java.util.ArrayList;
import java.util.List;

public class Email {
    private String subject;
    private String body;
    private String sender;
    private String recipient;

    private List<String> ccList;
    private List<String> attachmentList;

    private Email(String subject, String body, String sender, String recipient, List<String> ccList, List<String> attachments) {
        this.subject = subject;
        this.body = body;
        this.sender = sender;
        this.recipient = recipient;
        this.ccList = ccList;
        this.attachmentList = attachments;
    }

    @Override
    public String toString() {
        return "Email { \n" +
                "subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", ccList=" + ccList +
                ", attachmentList=" + attachmentList +
                '}';
    }

    // Builder method to create an EmailBuilderImpl object
    public static EmailBuilder builder() {
        return new EmailBuilder();
    }

    public static class EmailBuilder {
        private String subject;
        private String body;
        private String sender;
        private String recipient;
        private List<String> ccList = new ArrayList<>();
        private List<String> attachmentList = new ArrayList<>();

        public EmailBuilder setSubject(String subject) {
            this.subject = subject;
            return this;
        }


        public EmailBuilder setBody(String body) {
            this.body = body;
            return this;
        }

        public EmailBuilder setSender(String sender) {
            this.sender = sender;
            return this;
        }

        public EmailBuilder setRecipient(String recipient) {
            this.recipient = recipient;
            return this;
        }

        public EmailBuilder addCc(String cc) {
            ccList.add(cc);
            return this;
        }

        public EmailBuilder addAttachment(String attachment) {
            attachmentList.add(attachment);

            return this;
        }

        public Email build() {
            return new Email(subject, body, sender, recipient, ccList, attachmentList);
        }
    }
}
