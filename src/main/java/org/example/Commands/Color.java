package org.example.Commands;

import java.util.ArrayList;

import static org.example.Caretaker.saveCommand;
import static org.example.ListHandler.State.*;

public class Color extends Commands{

    private static final String[] validColors = {"Red", "Blue", "Yellow", "Orange", "Green"};
    private static String previousColor = "";

    public Color() {
        //Empty
    }

    public void execute(ArrayList<String> command) {
        if(selectedShape != null){
            if (command.get(0).equals("COLOR")) {
                String color = command.get(1);
                if (validateColor(color)) {
                    changeColor(color);
                    saveCommand(new Color());
                } else {
                    System.out.println(color + " is an invalid color");
                }
            }
        } else {
            System.out.println("Error: No shape selected.");
        }
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
        updateColor(color);
    }


     public void undo(){
        selectedShape.setColor(previousColor);
     }
}