package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        File file = new File("input3.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> input = new ArrayList<>();
        String tmp;
        while(null != (tmp = br.readLine())){
            String[] line = tmp.split(" ");
            input.addAll(Arrays.asList(line));
            EventHandler.handler(input);
            input.clear();
        }
    }
}
