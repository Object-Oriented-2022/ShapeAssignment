package org.example.Commands;

import org.example.ListHandler.State;
import java.util.ArrayList;

import static org.example.ListHandler.State.*;

public class Move extends Commands{
    //TODO: FIRST
    private static String previousOrigin;
    public Move(){
        previousOrigin = "";
    }
    public boolean execute(ArrayList<String> command) {
        if(checkSelected()) {
            String origin = ("("+command.get(1)+","+command.get(2)+")");
            changeOrigin(origin);
            return true;
        } else {
            System.out.println("Error: No shape selected.");
            return false;
        }
    }
    private static void changeOrigin(String origin) {
        previousOrigin = updateOrigin(origin);
    }
    public void undo() {
        updateOrigin(previousOrigin);
    }

}