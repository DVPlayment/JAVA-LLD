package org.example.OOPattern.Observer;

public class SendEmailNotification implements SendNotification {
    String email;

    SendEmailNotification(String email) {
        this.email = email;
    }
    @Override
    public void sendNotification() {
        System.out.println(this.email + "Send email notification to users");
    }
}
