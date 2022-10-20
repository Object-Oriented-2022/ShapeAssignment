package org.example.Commands;

import java.util.ArrayList;

public abstract class Commands {

    public abstract void execute(ArrayList<String> command);
    public abstract void undo();

    public Commands(){

    }

}
