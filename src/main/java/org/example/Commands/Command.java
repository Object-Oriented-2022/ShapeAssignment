package org.example.Commands;

import java.util.ArrayList;

public interface Command {
    Object execute(ArrayList<String> command);
    void undo(Object previous);

}
