package ru.itmo.java.basics.lab4.Lab4_1_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое слагаемое");
        int numb1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе слагаемое");
        int numb2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите ожидаемую сумму");
        int numb3 = Integer.parseInt(reader.readLine());

        System.out.println(isSum(5, 10, 15));


    }

    public static Boolean isSum(int numb1, int numb2, int numb3){

         boolean isSum = numb1 + numb2 == numb3;
         if (isSum){
             return isSum;
         }
        return isSum;
    }


}
