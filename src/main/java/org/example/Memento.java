package org.example;

import org.example.Commands.Commands;

public class Memento {

    private Commands command;
    private Object previous;

    public Memento(Commands command, Object previous){
        setCommand(command);
        setPrevious(previous);
    }

    public Commands getCommand() {
        return command;
    }

    public void setCommand(Commands command) {
        this.command = command;
    }

    public Object getPrevious() {
        return previous;
    }

    public void setPrevious(Object previous) {
        this.previous = previous;
    }

}
