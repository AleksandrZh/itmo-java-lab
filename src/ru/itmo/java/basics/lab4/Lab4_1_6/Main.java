package ru.itmo.java.basics.lab4.Lab4_1_6;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{4, 2, 4, 1, 6, 7, 8, 4, 3, 4, 5};

        compare(array);

    }

    public static void compare(int[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 3 || array[i] == 1) {
                System.out.println(MessageFormat.format("Массив содержит число {0} ", array[i]));
            }
        }
    }


}
