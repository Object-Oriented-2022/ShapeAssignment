package org.example.ListHandler;

import org.example.Shapes.Shape;

import java.util.LinkedList;

public class State {
    public static Shape selectedShape = null;
    public static LinkedList<Shape> existingShapes = new LinkedList<>();
    //stack here for handling list of commands for current state to undo

    public static boolean checkSelected(){
        if(selectedShape != null) {
            return true;
        } else {
            return false;
        }
    }

    public static void addShape(Shape shape){
        existingShapes.add(shape);
    }

    public static void resetShape(){
        selectedShape = null;
    }

    public static String getCurrentColor(){
        return selectedShape.getColor();
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
        String previousSelect = String.valueOf(selectedShape.getID());
        selectedShape.setID(Integer.parseInt(shapeID));
        return previousSelect;
    }

    public static boolean updateDelete(Shape shape){
        int shapeID = shape.getID();
        for(int i = 0; i < existingShapes.size(); i++) {
            if (existingShapes.get(i).getID() == shapeID - 1) {
                existingShapes.add(i + 1, shape);
                return true;
            }
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

    /*TODO REMOVE OR FINISH
    private static void resetSelected() {

    }*/


}

