package ru.itmo.java.basics.lab10.Lab10_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String str = "Есть много вариантов Lorem Ipsum";
        String path = "files/outputLab10_2.txt";

        writeStringFile(str, path);
    }

    public static void writeStringFile(String str, String path){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
                writer.write(str);
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }

    }
}
