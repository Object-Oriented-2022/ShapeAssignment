package org.example.Commands;

import org.example.ListHandler.State;

import java.util.ArrayList;

import static org.example.ListHandler.State.resetShape;

public class Select {

    //TODO: EXTEND COMMANDS
    //TODO: RETURN BOOLEAN
    //TODO: IMPLEMENT EXECUTE
    public static void select(ArrayList<String> command) {
        selectShape(command.get(1));
    }

    private static void selectShape(String shapeID) {
        resetShape();
        System.out.println("Selected shape " + shapeID);
        for (int i = 0; i < State.existingShapes.size(); i++) {
            if (State.existingShapes.get(i).getID() == Integer.parseInt(shapeID)) {
                State.selectedShape = State.existingShapes.get(i);
                System.out.println(State.selectedShape.getID());
                break;
            }
        }
        if (State.selectedShape == null){
            System.out.println("ERROR: invalid shape for SELECT");
        }
        // set the selectedShape in the state class to the corresponding UID from the command in the linkedList

    }

    /*TODO: SELECT UNDO
     private static void undo(){

    }*/
}
