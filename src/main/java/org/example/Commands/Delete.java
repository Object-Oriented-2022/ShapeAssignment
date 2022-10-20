package org.example.Commands;

import org.example.Shapes.Shape;

import java.util.ArrayList;

import static org.example.ListHandler.State.*;

public class Delete {

    private static Shape previousDeleted = null;

    //TODO: EXTEND COMMANDS
    //TODO: RETURN BOOLEAN
    //TODO: IMPLEMENT EXECUTE
    public static void delete(ArrayList<String> command){
        if(checkSelected()){
            deleteShape();
        } else {
            System.out.println("No shape selected, cannot delete!");
        }
    }

    private static void deleteShape() {
        previousDeleted = selectedShape;
        removeFromExisting();
    }

    /*TODO: DELETE UNDO
    private static void undo(){

    }*/
}
