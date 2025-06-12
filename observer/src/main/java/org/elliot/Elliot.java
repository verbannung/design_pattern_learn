package org.elliot;

public class Elliot implements Observer{
    @Override
    public void receiveNotification(String message) {
        System.out.println("elliot received: " + message);
    }


}
