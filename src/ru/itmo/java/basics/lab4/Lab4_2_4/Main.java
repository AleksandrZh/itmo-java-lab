package ru.itmo.java.basics.lab4.Lab4_2_4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4};

        System.out.println(Arrays.toString(array));
        unicShow(array);

    }

    public static void unicShow(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int tempi = array[i];
                    int tempj = array[j];
                    array[i] = tempj;
                    array[j] = tempi;
                }
            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                i += 1;
                continue;
            } else {
                System.out.println(array[i]);
                break;
            }
        }

    }
}
