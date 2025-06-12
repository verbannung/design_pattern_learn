package org.elliot;

public class Mark implements Observer{
    @Override
    public void receiveNotification(String message) {
        System.out.println("mark received: " + message);
    }


}
