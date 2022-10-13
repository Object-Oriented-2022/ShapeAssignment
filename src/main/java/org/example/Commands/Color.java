package org.example.Commands;

import java.util.ArrayList;

public class Color {

    private static final String[] validColors = {"Red", "Blue", "Yellow", "Orange", "Green"};

    public static void color (ArrayList<String> command){
        if(command.get(0).equals("COLOR")) {
            String color = command.get(1);
            if(validateColor(color)) {
                changeColor(color);
            } else {
                System.out.println(color + " is an invalid color");
            }
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
        System.out.println("Color Changed: " + color);
    }
}