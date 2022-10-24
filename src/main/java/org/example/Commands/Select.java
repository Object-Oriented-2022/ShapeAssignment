package org.example.Commands;

import org.example.Shapes.Shape;

import java.util.ArrayList;

import static org.example.ListHandler.State.*;

public class Select extends Commands{
    //TODO: Double check undo

    private static String previousSelect;
    public Select(){
        previousSelect = "";
    }
    public Object execute(ArrayList<String> command) {
        if(!checkSelected()){
            selectShape(command.get(1));
        }else {
            String selectID = (command.get(1));
            changeSelect(selectID);
            selectShape(command.get(1));
        }
        return previousSelect;
    }

    private static void selectShape(String shapeID) {
        int newID = Integer.parseInt(shapeID);
        for (Shape existingShape : existingShapes) {
            if (existingShape.getID() == newID) {
                selectedShape = existingShape;
                break;
            }
        }
        if (selectedShape.getID() != newID){
            System.out.println("ERROR: invalid shape for SELECT");
        }
    }
    private static void changeSelect(String selectID){
        previousSelect = updateSelect(selectID);
    }
    public void undo(Object previous){
        if(!previous.equals("")){
            updateSelect((String) previous);
        } else {
            resetShape();
        }
    }
}
