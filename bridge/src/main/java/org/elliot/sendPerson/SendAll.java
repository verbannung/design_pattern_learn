package org.elliot.sendPerson;

public class SendAll implements SendPerson{

    @Override
    public void sendPerson() {
        System.out.println("发送给所有人");
    }
}
