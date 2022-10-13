package org.example;

import java.util.ArrayList;

public class Color {
    public static void color (ArrayList<String> command){
        if(command.get(0).equals("COLOR")) {
            String color = command.get(1);
            changeColor(color);
        }
    }

    private static void changeColor(String color) {
        //TODO: check for not-allowed colors
        System.out.println("Color Changed: " + color);
    }
}
