package org.example.Commands;

import java.util.ArrayList;
import static org.example.ListHandler.State.*;

public class Color extends Commands{
    //TODO: DONE
    private static final String[] validColors = {"Red", "Blue", "Yellow", "Orange", "Green"};
    private static String previousColor;

    public Color(){
        previousColor = "";
    }
    public boolean execute(ArrayList<String> command) {
        if (checkSelected()) {
            String color = command.get(1);
            if (validateColor(color)) {
                changeColor(color);
                return true;
            } else {
                System.out.println(color + " is an invalid color");
            }
        } else {
            System.out.println("Error: No shape selected.");
        }
        return false;
    }

    private static boolean validateColor(String color) {
        boolean validation = false;
        for (String validColor : validColors) {
            if (validColor.equals(color)) {
                validation = true;
                break;
            }
        }
        return validation;
    }

    private static void changeColor(String color) {
        previousColor = updateColor(color);
    }


     public void undo(){
        updateColor(previousColor);
     }
}