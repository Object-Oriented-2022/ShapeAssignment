package org.example;

import java.util.ArrayList;

public class Create {
    public static void create(ArrayList<String> command){
        System.out.print("Create Class");
        if(command.get(0).equals("CREATE")) {
            if(command.get(1).equals("Rectangle")) {
                createRectangle(command);
            } else if (command.get(1).equals("Circle")) {
                createCircle(command);
            } else {
                System.out.println("Shape does note exist!");
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
