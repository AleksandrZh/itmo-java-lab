package ru.itmo.java.basics.lab4.Lab4_1_5;

import java.text.MessageFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{3, -3, 7, 4, 5, 6, 8, 4, 3};

        System.out.println(show(array));

    }

    public static boolean show(int[] digit) {

        System.out.println(MessageFormat.format("array = {0} ", Arrays.toString(digit)));
        return digit[0] == 3 || digit[digit.length - 1] == 3;

    }


}


