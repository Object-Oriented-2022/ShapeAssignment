package org.example;

import org.example.Commands.Commands;

import java.util.Stack;

public class Caretaker {

    private static Stack<Memento> mementoObjects = new Stack<>();

    //hitSave();
    public static void saveCommand(Commands command, Object previous){
        Memento history = new Memento(command, previous);
        mementoObjects.push(history);
    }

    //hitUndo();
    public static void undoCommand(){
        if(mementoObjects.size() > 0){
            Memento memento = mementoObjects.pop();
            Commands command = memento.getCommand();
            Object previous = memento.getPrevious();
            command.undo(previous);
        }
        else{
            System.out.println("No more commands to undo.");
        }
    }


}
