package org.example.OOPattern.Observable;

import org.example.OOPattern.Observer.SendNotification;

public interface Stock {
    void add(SendNotification sendNotificationObj);
    void remove(SendNotification sendNotificationObj);
    void update();
    void set(int ct);
    int get();
}
