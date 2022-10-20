package org.example.Commands;

import java.util.ArrayList;

public abstract class Commands implements Command{

    public abstract boolean execute(ArrayList<String> command);
    public abstract void undo();

    public Commands(){

    }

}
