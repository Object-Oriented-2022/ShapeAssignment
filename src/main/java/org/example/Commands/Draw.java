package org.example.Commands;

import java.util.ArrayList;

import static org.example.ListHandler.State.checkSelected;
import static org.example.ListHandler.State.drawSelectedShape;

public class Draw {
    //TODO: EXTEND COMMANDS
    //TODO: RETURN BOOLEAN
    //TODO: IMPLEMENT EXECUTE
    public static void draw(ArrayList<String> command){
        if(checkSelected()){
            drawSelectedShape();
        } else {
            System.out.println("Error: No shape selected.");
        }
    }
}
