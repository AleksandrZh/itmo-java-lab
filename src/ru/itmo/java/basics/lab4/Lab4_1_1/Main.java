package ru.itmo.java.basics.lab4.Lab4_1_1;

public class Main {
    public static void main(String[] args) {
        int[] digit = new int[100];
        // циклом
        showOddLoop();
        // с заполнением массива
        showOdd(digit);

    }
    // Вариант без массива циклом
    public static void showOddLoop(){
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0) {
                System.out.println(i);
            }

        }
    }
    // Вариант с массивами
    public static void showOdd(int[] digit) {

        for (int i = 0; i < digit.length; i++) {
            digit[i] = i;
        }
        for (int j : digit){
            if (j%2 != 0) {
                System.out.println(j);
            }

        }


    }
}
