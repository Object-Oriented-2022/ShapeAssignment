package org.example.Commands;

import java.util.ArrayList;

public class DrawScene {
    public static void drawScene(ArrayList<String> command){
        if(command.get(0).equals("DRAWSCENE")) {
            System.out.println("Draw All Existing Shapes");
        }
    }
}
