package ru.itmo.java.basics.lab4.Lab4_2_3;

import java.text.MessageFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 2};

        changeElement(array);

    }

    public static void changeElement(int[] array) {
        System.out.println(MessageFormat.format("Array 1: {0} ", Arrays.toString(array)));
        int tempElement0 = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = tempElement0;
        System.out.println(MessageFormat.format("Array 2: {0} ", Arrays.toString(array)));
    }
}
