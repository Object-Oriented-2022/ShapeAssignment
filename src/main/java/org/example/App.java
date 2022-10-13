package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Handler;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args ) throws IOException {
        File file = new File("input.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        ArrayList<String> input = new ArrayList<String>();
        String tmp;
        while(null != (tmp = br.readLine())){
            String line[] = tmp.split(" ");
            input.addAll(Arrays.asList(line));
            //System.out.println(input);
            EventHandler.handler(input);
            input.clear();
        }
    }
}
