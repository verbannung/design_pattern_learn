package org.elliot;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        invoker.addCommand(new CommandA());
        invoker.addCommand(new CommandB());
        invoker.execute();


        Invoker invokerUndo = new Invoker();
        invokerUndo.addCommand(new CommandA());
        invokerUndo.addCommand(new CommandB());
        invokerUndo.unexecute();
    }
}