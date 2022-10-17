package org.example;

import org.example.Commands.*;

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
        Create.create(command);
        Select.select(command);
        Color.color(command);
        Move.move(command);
        Draw.draw(command);
        DrawScene.drawScene(command);
        Delete.delete(command);
    }
}
