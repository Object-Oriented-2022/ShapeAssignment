package org.example.Commands;

import org.example.Shapes.Circle;
import org.example.Shapes.Rectangle;
import org.example.Shapes.Shape;

import java.util.ArrayList;

import static org.example.ListHandler.State.*;

public class Create extends Commands{

    private static int creationNumber = 0;
    private static Shape previousCreation = null;

    public Create(){

    }

    public Object execute(ArrayList<String> command){
        if(command.get(1).equals("RECTANGLE")) {
            createRectangle(command);
        } else if (command.get(1).equals("CIRCLE")) {
            createCircle(command);
        } else {
            System.out.println("Shape does not exist!");
        }
        return previousCreation;
    }

    private static void createRectangle(ArrayList<String> command) {
        String width = command.get(2);
        String height = command.get(3);
        creationNumber++;
        int idNum = creationNumber;
        Shape rectangle = new Rectangle(width, height, idNum);
        addShape(rectangle);
        previousCreation = rectangle;
    }

    private static void createCircle(ArrayList<String> command) {
        String radius = command.get(2);
        creationNumber++;
        int idNum = creationNumber;
        Shape circle = new Circle(radius, idNum);
        addShape(circle);
        previousCreation = circle;
    }


     public void undo(Object previous){
        undoCreation((Shape) previous);
     }

}
