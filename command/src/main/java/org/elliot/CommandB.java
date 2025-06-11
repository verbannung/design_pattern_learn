package org.elliot;

public class CommandB implements Command{

    @Override
    public void execute() {
        System.out.println("CommandB 执行");
    }

    @Override
    public void undo() {
        System.out.println("CommandB 取消执行");
    }
}
