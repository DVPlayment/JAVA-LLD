package org.example.OOPattern.Observer;

public class SendMobileNotification implements SendNotification{
    String email;

    public SendMobileNotification(String email) {
        this.email = email;
    }

    @Override
    public void sendNotification() {
        System.out.println(this.email + "Send push notification to users");
    }
}

