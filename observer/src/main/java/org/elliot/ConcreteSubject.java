package org.elliot;


import org.elliot.Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private final List<Observer> observers=new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        String message="通知";
        observers.iterator().forEachRemaining(observer -> observer.receiveNotification(message));
    }
}
