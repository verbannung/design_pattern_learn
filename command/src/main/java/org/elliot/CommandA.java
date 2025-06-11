package org.elliot;

public class CommandA implements Command{

    @Override
    public void execute() {
        System.out.println("CommandA 执行");
    }

    @Override
    public void undo() {
        System.out.println("CommandA 取消执行");
    }
}
