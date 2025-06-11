package org.elliot;

import org.elliot.objectAdapter.Adaptee;
import org.elliot.objectAdapter.Adapter;

public class Main {
    public static void main(String[] args) {
//        Adapter adapter = new Adapter();
//        adapter.changeName();

        Adapter adapter=new Adapter();
        adapter.adaptee=new Adaptee();
        adapter.changeName();

    }
}