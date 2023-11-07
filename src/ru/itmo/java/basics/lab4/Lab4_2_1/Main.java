package ru.itmo.java.basics.lab4.Lab4_2_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 4, 4, 5, 5, 45, 57, 81, 90};

        System.out.println((Arrays.toString(array)));
        checkSort(array);


    }

    public static void checkSort(int[] array){
        int count = 0;
        for (int i = 0; i < array.length - 1 ; i++) {
            if (array[i] > array[i + 1]){
                System.out.println("Please, try again");
                break;
            }else {
                count++;
            }
        }
        if (count == array.length-1){
            System.out.println("ОК");
        }


    }
}
