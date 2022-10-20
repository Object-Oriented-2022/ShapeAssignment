package org.example.Commands;

import java.util.ArrayList;

public interface Command {
    public boolean execute(ArrayList<String> command);
    public void undo();

}
