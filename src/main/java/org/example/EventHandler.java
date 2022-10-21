package org.example;

import org.example.Commands.*;
import static org.example.Caretaker.saveCommand;

import java.util.ArrayList;

public class EventHandler {

    public static void handler(ArrayList<String> command){
        /*TODO: handle UNDO
          if undo, grab last command
          ? remote controller class
          ? checks
          ? maybe, push command to stack
                   if undo
                       pop stack
                       append or prepend undo
                       inside class check for undo
                       if undo assign to previous color
                       but how do we reassign the previous previous color?
        */
        //Commands successfulCommand;
        boolean success;
        switch(command.get(0)){
            case "CREATE":
                Create.create(command);
                break;
            case "SELECT":
                Commands select = new Select();
                success = select.execute(command);
                if(success){
                    saveCommand(select);
                }
                break;
            case "COLOR":
                Commands color = new Color();
                success = color.execute(command);
                if(success){
                    saveCommand(color);
                }
                break;
            case "MOVE":
                Commands move = new Move();
                success = move.execute(command);
                if(success){
                    saveCommand(move);
                }
                break;
            case "DRAW":
                Commands draw = new Draw();
                draw.execute(command);
                break;
            case "DRAWSCENE":
                Commands drawscene = new DrawScene();
                drawscene.execute(command);
                break;
            case "DELETE":
                Delete.delete(command);
                break;
            case "UNDO":
                Commands undo = new Undo();
                if(!undo.execute(command)){
                    System.out.println("Error Undoing.");
                }
                break;
            default:
                System.out.println("Command DNE");
                break;
        }
    }
}
