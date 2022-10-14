package org.example.Commands;

import java.util.ArrayList;

import static org.example.ListHandler.State.drawExistingShapes;

public class DrawScene {
    public static void drawScene(ArrayList<String> command){
        if(command.get(0).equals("DRAWSCENE")) {
            drawExistingShapes();
        }
    }
}
