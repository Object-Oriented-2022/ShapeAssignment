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
        Object previous;
        switch (command.get(0)) {
            case "CREATE" -> {
                Commands create = new Create();
                previous = create.execute(command);
                if (previous != null) {
                    saveCommand(create, previous);
                } else {
                    System.out.println("Error Creating, shape DNE");
                }
            }
            case "SELECT" -> {
                Commands select = new Select();
                previous = select.execute(command);
                if (previous != null) {
                    saveCommand(select, previous);
                }
            }
            case "COLOR" -> {
                Commands color = new Color();
                previous = color.execute(command);
                if (previous != null) {
                    saveCommand(color, previous);
                }
            }
            case "MOVE" -> {
                Commands move = new Move();
                previous = move.execute(command);
                if (previous != null) {
                    saveCommand(move, previous);
                }
            }
            case "DRAW" -> {
                Commands draw = new Draw();
                draw.execute(command);
            }
            case "DRAWSCENE" -> {
                Commands drawscene = new DrawScene();
                drawscene.execute(command);
            }
            case "DELETE" -> {
                Commands delete = new Delete();
                previous = delete.execute(command);
                if (previous != null) {
                    saveCommand(delete, previous);
                }
            }
            case "UNDO" -> {
                Commands undo = new Undo();
                if (undo.execute(command) == null) {
                    System.out.println("Error Undoing.");
                }
            }
            default -> System.out.println("Command DNE");
        }
    }
}
