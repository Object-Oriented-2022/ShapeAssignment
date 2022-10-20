package org.example.Commands;

import org.example.ListHandler.State;
import java.util.ArrayList;

import static org.example.ListHandler.State.checkSelected;
import static org.example.ListHandler.State.selectedShape;

public class Move {

    //TODO: EXTEND COMMANDS
    //TODO: RETURN BOOLEAN
    //TODO: IMPLEMENT EXECUTE
    public static void move(ArrayList<String> command) {
        if(checkSelected())
            setCoordinates(command.get(1), command.get(2));
        else
            System.out.println("Error: No shape selected.");
    }

    private static void setCoordinates(String x, String y) {
        selectedShape.setOrigin("("+x+","+y+")");
        System.out.println("Move: " + x + " " + y);
    }

    /*TODO: MOVE UNDO
     private static void undo(){

     }*/
}
