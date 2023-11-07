package ru.itmo.java.basics.lab4.Lab4_1_2;

import java.text.MessageFormat;

public class Main {
    public static void main(String[] args) {

        divideBy();

    }

    public static void divideBy(){
        for (int i = 1; i <= 100; i++) {

            if (i%3 == 0 ){
                System.out.println(MessageFormat.format("делится на 3: {0}",i));
            }
            if (i%5 == 0 ){
                System.out.println(MessageFormat.format("делится на 5: {0}",i));
            }
            if (i%3 == 0 && i%5 == 0) {
                System.out.println(MessageFormat.format("делится на 3 и на 5: {0}",i));
            }

        }
    }
}
