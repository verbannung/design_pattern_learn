package org.elliot;

import org.elliot.sendPerson.SendAdmin;
import org.elliot.sendPerson.SendAll;
import org.elliot.sendScenes.Overdue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Overdue overdueSendAll = new Overdue(new SendAll());
        overdueSendAll.sendMessage();

        Overdue overdueSendAdmin = new Overdue(new SendAdmin());
        overdueSendAdmin.sendMessage();
    }
}