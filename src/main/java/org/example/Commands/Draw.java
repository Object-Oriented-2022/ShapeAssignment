package org.example.Commands;

import java.util.ArrayList;

public class Draw {
    public static void draw(ArrayList<String> command){
        if(command.get(0).equals("DRAW")) {
            System.out.println("Draw Current Selected Shape");
        }
    }
}
