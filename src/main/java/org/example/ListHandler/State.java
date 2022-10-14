package org.example.ListHandler;

import org.example.Shapes.Shape;

import java.util.LinkedList;

public class State {
    public static Shape selectedShape = null;
    public static LinkedList<Shape> existingShapes = new LinkedList<>();
    //stack here for handling list of commands for current state to undo

    public static void addShape(Shape shape){
        existingShapes.add(shape);
    }

    public static void resetShape(){
        selectedShape = null;
    }


}

