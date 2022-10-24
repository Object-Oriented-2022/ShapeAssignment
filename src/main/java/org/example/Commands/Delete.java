package org.example.Commands;

import org.example.Shapes.Shape;

import java.util.ArrayList;

import static org.example.ListHandler.State.*;

public class Delete extends Commands{

    private static Shape previousDeleted;

    public Delete(){
       previousDeleted = null;
    }

    public Object execute(ArrayList<String> command){
        if(checkSelected()){
            deleteShape();
        } else {
            System.out.println("No shape selected, cannot delete!");
        }
        return previousDeleted;
    }

    private static void deleteShape() {
        previousDeleted = selectedShape;
        removeFromExisting();
        resetShape();
    }

    public void undo(Object previous){
        if(!updateDelete((Shape) previous)){
            System.out.println("Error: unable to undo delete.");
        }
    }
}
