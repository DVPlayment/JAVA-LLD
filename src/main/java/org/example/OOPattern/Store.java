package org.example.OOPattern;

import org.example.OOPattern.Observable.MixerStock;
import org.example.OOPattern.Observable.Stock;
import org.example.OOPattern.Observer.SendMobileNotification;
import org.example.OOPattern.Observer.SendNotification;

public class Store {

    public static void main(String[] args) {
        Stock mixerStock = new MixerStock();
        SendNotification s1 = new SendMobileNotification("hello@gmail.com");
        SendNotification s2 = new SendMobileNotification("adsa@gmail.com");
        SendNotification s3 = new SendMobileNotification("dfs@gmail.com");
        SendNotification s4 = new SendMobileNotification("tyjf@gmail.com");
        mixerStock.add(s1);
        mixerStock.add(s2);
        mixerStock.add(s3);
        mixerStock.add(s4);
        System.out.println("before");
        mixerStock.update();
        System.out.println("After");
        mixerStock.set(10);
        mixerStock.update();
    }
}
