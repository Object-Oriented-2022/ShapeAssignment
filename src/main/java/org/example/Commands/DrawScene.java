package org.example.Commands;

import java.util.ArrayList;

import static org.example.ListHandler.State.drawExistingShapes;

public class DrawScene {
    //TODO: EXTEND COMMANDS
    //TODO: RETURN BOOLEAN
    //TODO: IMPLEMENT EXECUTE
    public static void drawScene(ArrayList<String> command){
        drawExistingShapes();
    }
}
