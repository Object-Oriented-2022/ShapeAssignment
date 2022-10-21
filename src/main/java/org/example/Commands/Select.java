package org.example.Commands;

import org.example.ListHandler.State;

import java.util.ArrayList;

import static org.example.ListHandler.State.*;

public class Select extends Commands{
    private static String previousSelect;
    public Select(){
        previousSelect = "";
    }
    public boolean execute(ArrayList<String> command) {
        boolean results = false;
        if(checkSelected() == false){
            results = selectShape(command.get(1));
        }else {
            String selectID = (command.get(1));
            changeSelect(selectID);
            selectShape(command.get(1));
        }
        return results;
    }

    private static boolean selectShape(String shapeID) {
        System.out.println("Selected shape " + shapeID);
        for (int i = 0; i < State.existingShapes.size(); i++) {
            if (State.existingShapes.get(i).getID() == Integer.parseInt(shapeID)) {
                State.selectedShape = State.existingShapes.get(i);
                System.out.println(State.selectedShape.getID());
                return true;
            }
        }
        if (State.selectedShape == null){
            System.out.println("ERROR: invalid shape for SELECT");
        }
        return false;
    }
    private static void changeSelect(String selectID){
        previousSelect = updateSelect(selectID);
    }
    public void undo(){
        if(!previousSelect.equals("")){
            updateSelect(String.valueOf(previousSelect));
        }else {
            resetShape();
        }
    }
}
