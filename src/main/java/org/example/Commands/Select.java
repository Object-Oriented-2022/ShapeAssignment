package org.example.Commands;

import java.util.ArrayList;

import static org.example.ListHandler.State.*;

public class Select extends Commands{
    private static String previousSelect;

    public Select(){
        previousSelect = "";
    }

    public Object execute(ArrayList<String> command) {
        if(!checkSelected()){
            updateSelect(command.get(1));
        } else {
            previousSelect = updateSelect(command.get(1));
        }
        return previousSelect;
    }

    public void undo(Object previous) {
        if(!previous.equals("")){
            updateSelect((String) previous);
        } else {
            resetShape();
        }
    }
}
