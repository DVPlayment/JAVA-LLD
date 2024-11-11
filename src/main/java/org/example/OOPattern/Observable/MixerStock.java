package org.example.OOPattern.Observable;

import org.example.OOPattern.Observer.SendNotification;

import java.util.ArrayList;
import java.util.List;

public class MixerStock implements Stock{

    public List<SendNotification> sendNotificationObs = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void add(SendNotification sendNotificationObj) {
        sendNotificationObs.add(sendNotificationObj);
    }

    @Override
    public void remove(SendNotification sendNotificationObj) {
        sendNotificationObs.remove(sendNotificationObj);
    }

    @Override
    public void update() {
        if (stockCount > 0) {
            for (SendNotification s: sendNotificationObs) {
                s.sendNotification();
            }
        }

    }

    @Override
    public void set(int ct) {
        stockCount = ct;
    }

    @Override
    public int get() {return stockCount;}

}
