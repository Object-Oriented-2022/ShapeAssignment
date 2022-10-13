package org.example.Commands;

import java.util.ArrayList;

public class Create {
    public static void create(ArrayList<String> command){
        if(command.get(0).equals("CREATE")) {
            if(command.get(1).equals("RECTANGLE")) {
                createRectangle(command);
            } else if (command.get(1).equals("CIRCLE")) {
                createCircle(command);
            } else {
                System.out.println("Shape does not exist!");
            }
        }
    }

    private static void createRectangle(ArrayList<String> command) {
        System.out.println("Created Rectangle");
    }

    private static void createCircle(ArrayList<String> command) {
        System.out.println("Created Circle");
    }
}
