package org.example.ListHandler;

import org.example.Shapes.Shape;

import java.util.LinkedList;

public class State {
    public static Shape selectedShape = null;
    public static LinkedList<Shape> existingShapes = new LinkedList<>();
    //stack here for handling list of commands for current state to undo

    public static boolean checkSelected(){
        return selectedShape != null;
    }

    public static void addShape(Shape shape){
        existingShapes.add(shape);
    }

    public static void resetShape(){
        selectedShape = null;
    }

    public static String updateOrigin(String origin){
        String previousOrigin = selectedShape.getOrigin();
        selectedShape.setOrigin(origin);
        return previousOrigin;
    }

    public static String updateColor(String color){
        String previousColor = selectedShape.getColor();
        selectedShape.setColor(color);
        return previousColor;
    }

    public static String updateSelect(String shapeID){
        int newIndex = Integer.parseInt(shapeID);
        String previousSelect = "";
        if(selectedShape != null) {
            previousSelect = String.valueOf(selectedShape.getID());
        }
        selectedShape = existingShapes.get(newIndex);
        return  previousSelect;
        /*
        int newID = Integer.parseInt(shapeID);
        String previousSelect = String.valueOf(selectedShape.getID());
        for (Shape existingShape : existingShapes) {
            if (existingShape.getID() == newID) {
                selectedShape = existingShape;
                break;
            }
        }
        return previousSelect;*/
    }

    //TODO: change
    public static boolean updateDelete(Shape shape){
        int shapeID = shape.getID();
        int i = 0;
        while (i < existingShapes.size()) {
            if (existingShapes.get(i).getID() == shapeID - 1) {
                existingShapes.add(i + 1, shape);
                return true;
            }
            i++;
        }
        return false;
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
        boolean output = existingShapes.remove(selectedShape);
        if(!output){
            System.out.println("Selected Shape does not exist");
        }
    }

    public static void undoCreation(Shape previous) {
        boolean output = existingShapes.remove(previous);
        if(!output){
            System.out.println("Selected Shape does not exist");
        }
    }
}

