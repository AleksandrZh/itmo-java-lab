package ru.itmo.java.basics.lab10.Lab10_3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
// Выполнено используя решение 1 и 2, то есть мердж списка полученного в первом задании с файлом во втором,  работа происходит в методе mergeListFiles()
        File file = new File("files/text.txt");
        List<String> str = new ArrayList<>();
        List list = readFile(file, str);

        String str1 = "Есть много вариантов Lorem Ipsum";
        String path = "files/outputLab10_3.txt";

        writeStringFile(str1, path );

        String pathForMerge = "files/outputLab10_3_Merge.txt";

        File fileLab10_3 = new File("files/outputLab10_3.txt");


        mergeListFiles(list, fileLab10_3, pathForMerge );

    }

    public static List readFile(File file, List str1){
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){

            String input;
            while((input = reader.readLine()) != null ){
                str1.add(input);
            };


        } catch(IOException e){
            System.err.println("Error: " + e.getMessage());

        }

        return str1;
    }

    public static void writeStringFile(String str, String path){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write(str);
        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }

    }

    public static void mergeListFiles(List<String> str, File file, String path ){


        List<String> buffer = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                buffer.add(line);
            };


        } catch(IOException e){
            System.err.println("Error: " + e.getMessage());

        }



        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            for (String string : str){
                writer.write(string);
            }

            for (String string : buffer){
                writer.append(string);
            }




        }catch(IOException e){
            System.err.println("Error: " + e.getMessage());
        }




    }



}
