package org.elliot.classAdapter;

public class Adapter extends Adaptee implements Target{

    @Override
    public void changeName() {
        //这是很重要的！
        super.changeName();
        System.out.println("Adapter changeName");
    }

}
