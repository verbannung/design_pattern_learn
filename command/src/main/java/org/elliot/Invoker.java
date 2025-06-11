package org.elliot;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private final List<Command> commands=new ArrayList<Command>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void unexecute() {
        for (Command command : commands) {
            command.undo();
        }
    }

}
