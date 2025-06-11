package org.elliot.sendScenes;

import org.elliot.sendPerson.SendPerson;

public class Overdue extends SendScenes{
    public Overdue(SendPerson sendPerson) {
        super(sendPerson);
    }

    @Override
    public void sendMessage() {
        System.out.println("超时发送信息");
        sendPerson.sendPerson();
    }
}
