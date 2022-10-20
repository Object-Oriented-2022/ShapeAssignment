package org.example.Commands;

import java.util.ArrayList;

public interface Command {
    boolean execute(ArrayList<String> command);
    void undo();

}
