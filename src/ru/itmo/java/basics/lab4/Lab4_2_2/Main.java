package ru.itmo.java.basics.lab4.Lab4_2_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите длинну массива:");
        int numb1 = Integer.parseInt(reader.readLine());
        int [] array = new int[numb1];

//        for (int i = 0; i < array.length; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//        }

        insertElement(array);
        show(array);



    }

    public static void insertElement(int[] array) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < array.length; i++) {
            System.out.println(MessageFormat.format("Введите {0} элемент массива:", i+1));
            array[i] = Integer.parseInt(reader.readLine());
        }
    }
    public static void show(int[] array){
        System.out.println(MessageFormat.format("Array length: {0} ", array.length));
        System.out.println("Numbers of array:");
        for (int i: array) {
            System.out.println(i);
        }

        System.out.println(MessageFormat.format("Result: {0} ", Arrays.toString(array)));
    }

}
