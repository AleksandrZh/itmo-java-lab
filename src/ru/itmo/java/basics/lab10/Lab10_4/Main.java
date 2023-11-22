package ru.itmo.java.basics.lab10.Lab10_4;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("files/textLab10_4.txt");
        String path = "files/OutputLab10_4.txt";

        changeFile(file, path);



    }

    public static void changeFile(File file, String path) throws IOException {

        StringBuilder stringB = new StringBuilder();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {

            String line;
            while ((line = in.readLine()) != null) {

                stringB.append(line.replaceAll("\\s+", Matcher.quoteReplacement("$")).replaceAll("\\p{Punct}",Matcher.quoteReplacement("$")));

            }


        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(stringB.toString());

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }


    }

}
