package org.example.Commands;

import java.util.ArrayList;

import static org.example.ListHandler.State.*;

public class Move extends Commands{

    private static String previousOrigin;
    public Move(){
        previousOrigin = "";
    }
    public Object execute(ArrayList<String> command) {
        if(checkSelected()) {
            String origin = ("("+command.get(1)+","+command.get(2)+")");
            changeOrigin(origin);
        } else {
            System.out.println("Error: No shape selected.");
        }
        return previousOrigin;
    }
    private static void changeOrigin(String origin) {
        previousOrigin = updateOrigin(origin);
    }
    public void undo(Object previous) {
        updateOrigin((String) previous);
    }

}