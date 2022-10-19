package org.example;

import org.example.Shapes.Shape;

import java.util.Stack;

public class Caretaker {

    private static Stack<String> commandsProcessed = new Stack<>();
    private static Stack<Shape> previousShapeStates = new Stack<>();

    //hitSave();
    public static void saveCommand(String command){
        commandsProcessed.push(command);
    }

    //hitUndo();
    public static void undoCommand(){
        String lastCommand = commandsProcessed.pop();
        Shape lastState = previousShapeStates.pop();
    }

    //public static void


}
