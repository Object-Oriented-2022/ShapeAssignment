package org.example.Commands;

import java.util.ArrayList;

public class Delete {
    public static void delete(ArrayList<String> command){
        if(command.get(0).equals("DELETE")) {
            System.out.println("Delete Current Selected Shape");
        }
    }
}
