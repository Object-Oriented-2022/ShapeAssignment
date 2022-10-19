package org.example.Commands;

import org.example.ListHandler.State;
import java.util.ArrayList;

import static org.example.ListHandler.State.selectedShape;

public class Move {
    public static void move(ArrayList<String> command) {
        if(command.get(0).equals("MOVE")) {
            setCoordinates(command.get(1), command.get(2));
        }
    }

    private static void setCoordinates(String x, String y) {
        selectedShape.setOrigin("("+x+","+y+")");
        System.out.println("Move: " + x + " " + y);
    }

    /*TODO: MOVE UNDO
     private static void undo(){

     }*/
}
