package org.example.Commands;

import java.util.ArrayList;

public abstract class Commands implements Command{

    public abstract Object execute(ArrayList<String> command);
    public abstract void undo(Object previous);

    public Commands(){

    }

}
