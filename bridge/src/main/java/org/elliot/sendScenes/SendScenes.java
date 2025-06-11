package org.elliot.sendScenes;

import org.elliot.sendPerson.SendPerson;

public abstract class SendScenes {
    public SendPerson sendPerson;

    abstract void sendMessage();

    public SendScenes(SendPerson sendPerson){
        this.sendPerson = sendPerson;
    }
}
