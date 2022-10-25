package org.example.ListHandler;

import org.example.Shapes.Shape;

import java.util.LinkedList;

public class State {
    public static Shape selectedShape = null;
    public static LinkedList<Shape> existingShapes = new LinkedList<>();

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
        int newIndex = Integer.parseInt(shapeID) - 1;
        String previousSelect = "";
        if(selectedShape != null) {
            previousSelect = String.valueOf(selectedShape.getID());
        }
        selectedShape = existingShapes.get(newIndex);
        return  previousSelect;
    }

    public static boolean updateDelete(Shape shape){
        int indexPos = shape.getID();
        existingShapes.add(indexPos, shape);
        return true;
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

    public static Shape removeFromExisting(){
        int previousPosition = existingShapes.indexOf(selectedShape);
        selectedShape.setID(previousPosition);
        Shape previousShape = selectedShape;
        boolean output = existingShapes.remove(selectedShape);
        if(!output){
            System.out.println("Selected Shape does not exist");
            return null;
        }
        return previousShape;
    }

    public static void undoCreation(Shape previous) {
        boolean output = existingShapes.remove(previous);
        if(!output){
            System.out.println("Selected Shape does not exist");
        }
    }
}

