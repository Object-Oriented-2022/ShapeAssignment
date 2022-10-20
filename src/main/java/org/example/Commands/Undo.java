package org.example.Commands;

import java.util.ArrayList;

import static org.example.Caretaker.undoCommand;

public class Undo {
    public static void execute(ArrayList<String> command){
        if(command.get(0).equals("UNDO")) {
            undoCommand();
        }

    }




}
