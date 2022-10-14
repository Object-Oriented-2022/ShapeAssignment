package org.example.Commands;

import java.util.ArrayList;

import static org.example.ListHandler.State.drawSelectedShape;

public class Draw {
    public static void draw(ArrayList<String> command){
        if(command.get(0).equals("DRAW")) {
            drawSelectedShape();
        }
    }
}
