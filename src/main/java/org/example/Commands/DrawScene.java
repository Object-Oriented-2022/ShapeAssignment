package org.example.Commands;

import java.util.ArrayList;

import static org.example.ListHandler.State.drawExistingShapes;

public class DrawScene extends Commands{

    public DrawScene(){
    }

    public Object execute(ArrayList<String> command){
        drawExistingShapes();
        return true;
    }

    public void undo(Object previous) {
        //Do nothing
    }


}
