package org.example.Commands;

import java.util.ArrayList;

import static org.example.ListHandler.State.checkSelected;
import static org.example.ListHandler.State.drawSelectedShape;

public class Draw extends Commands{

    public Draw(){}
    public boolean execute(ArrayList<String> command){
        if(checkSelected()){
            drawSelectedShape();
            return true;
        } else {
            System.out.println("Error: No shape selected.");
        }
        return false;
    }

    public void undo() {
        //Do nothing
    }

}
