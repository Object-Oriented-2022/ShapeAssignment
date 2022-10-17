package org.example.Commands;

import org.example.Shapes.Shape;

import java.util.ArrayList;

import static org.example.ListHandler.State.removeFromExisting;
import static org.example.ListHandler.State.selectedShape;

public class Delete {

    private static Shape previousDeleted = null;
    public static void delete(ArrayList<String> command){
        if(command.get(0).equals("DELETE")) {
            if(selectedShape != null){
                deleteShape();
            } else {
                System.out.println("No shape selected, cannot delete!");
            }
        }
    }

    private static void deleteShape() {
        previousDeleted = selectedShape;
        removeFromExisting();
        //resetSelected();
    }

    /*TODO: DELETE UNDO
    private static void undo(){
        //resetSelected to previous SELECTED
    }*/
}
