package org.elliot.sendScenes;

import org.elliot.sendPerson.SendPerson;

public class Complete extends SendScenes{

    public Complete(SendPerson sendPerson) {
        super(sendPerson);
    }

    @Override
    public void sendMessage() {
        System.out.println("完成发送消息");
        sendPerson.sendPerson();
    }
}
