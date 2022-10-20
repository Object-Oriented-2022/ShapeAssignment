package org.example.Commands;

import java.util.ArrayList;

import static org.example.Caretaker.undoCommand;

public class Undo extends Commands{

    public Undo(){
        //Empty
    }

    //TODO: CHANGE undoCommand TO RETURN BOOLEAN
    public boolean execute(ArrayList<String> command) {
        if(command.get(0).equals("UNDO")){
            undoCommand();
            return true;
        }
        return false;
    }

    public void undo() {
        //do nothing
    }
}
