package ru.itmo.java.basics.lab10.Lab10_1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("files/text.txt");

        List<String> str = new ArrayList<>();

        System.out.println(readFile(file, str));

    }

    public static List readFile(File file, List str){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){

            String input;
            while((input = reader.readLine()) != null ){
                str.add(input);
            };


        } catch(IOException e){
            System.err.println("Error: " + e.getMessage());

        }

        return str;
    }


}
