package org.elliot.objectAdapter;

public class Adapter implements Target{

    //这个要springboot bean注入
    public Adaptee adaptee;

    @Override
    public void changeName() {
        this.adaptee.changeName();
        System.out.println("Adapter changeName");
    }
}
