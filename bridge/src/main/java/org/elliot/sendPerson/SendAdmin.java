package org.elliot.sendPerson;

public class SendAdmin implements SendPerson{

    @Override
    public void sendPerson() {
        System.out.println("发送给管理员");
    }
}
