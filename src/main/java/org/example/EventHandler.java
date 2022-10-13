package org.example;

import org.example.Commands.*;

import java.util.ArrayList;

public class EventHandler {

    public static void handler(ArrayList<String> command){
        Create.create(command);
        Select.select(command);
        Color.color(command);
        Move.move(command);
        Draw.draw(command);
        DrawScene.drawScene(command);
        Delete.delete(command);
    }
}
