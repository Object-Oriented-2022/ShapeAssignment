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

    public static String getCurrentColor(){
        return selectedShape.getColor();
    }

    public static void updateColor(String color){
        selectedShape.setColor(color);
    }

    public static void drawShape(Shape shape){
        System.out.println(shape.toString());
    }

    public static void drawSelectedShape(){
        drawShape(selectedShape);
    }

    public static void drawExistingShapes(){
        for (Shape existingShape : existingShapes) {
            drawShape(existingShape);
        }
    }

    public static void removeFromExisting(){
        existingShapes.remove(selectedShape);
        //TODO: PREVIOUS SELECTED IN STATE OR IN SELECT? is it undo in select?
        //resetSelected();
    }

    /*TODO REMOVE OR FINISH
    private static void resetSelected() {

    }*/


}

