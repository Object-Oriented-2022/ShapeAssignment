package org.example.Commands;

import java.util.ArrayList;

public class Move {
    public static void move(ArrayList<String> command) {
        if(command.get(0).equals("MOVE")) {
            setCoordinates(command.get(1), command.get(2));
        }
    }

    private static void setCoordinates(String x, String y) {
        System.out.println("Move: " + x + " " + y);
    }
}
