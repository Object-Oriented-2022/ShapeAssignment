package org.example.Commands;

import org.example.Shapes.Shape;

import java.util.ArrayList;

import static org.example.ListHandler.State.*;

public class Delete extends Commands{

    private static Shape previousDeleted;

    public Delete(){
       previousDeleted = null;
    }

    public boolean execute(ArrayList<String> command){
        if(checkSelected()){
            deleteShape();
            return true;
        } else {
            System.out.println("No shape selected, cannot delete!");
        }
        return false;
    }

    private static void deleteShape() {
        previousDeleted = selectedShape;
        removeFromExisting();
        resetShape();
    }

    public void undo(){
        if(!updateDelete(previousDeleted)){
            System.out.println("Error: unable to undo delete.");
        }
    }
}
