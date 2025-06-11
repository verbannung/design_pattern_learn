package org.elliot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //一般情况下门面模式还要结合策略模式，定位到具体的子系统
        DeviceFacade deviceFacade = new DeviceFacade();
        deviceFacade.on();
        deviceFacade.off();
    }
}