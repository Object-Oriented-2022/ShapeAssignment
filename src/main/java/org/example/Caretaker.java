package org.example;

import org.example.Commands.Commands;
import org.example.Shapes.Shape;

import java.util.Stack;

public class Caretaker {

    private static Stack<Commands> mementoObjects = new Stack<>();

    //hitSave();
    public static void saveCommand(Commands command){
        mementoObjects.push(command);
    }

    //hitUndo();
    public static void undoCommand(){
        Commands command = mementoObjects.pop();
        command.undo();
    }


}
