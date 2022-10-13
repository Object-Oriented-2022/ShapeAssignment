package org.example.Commands;

import java.util.ArrayList;

public class Select {
    public static void select(ArrayList<String> command){
        if(command.get(0).equals("SELECT")) {
            selectShape(command.get(1));
        }
    }

    private static void selectShape(String shapeID) {
        System.out.println("Selected shape " + shapeID);
    }
}
