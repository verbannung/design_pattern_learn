package org.elliot;

public interface Command {

    void execute();

    void undo();
}
