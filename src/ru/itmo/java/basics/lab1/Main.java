package ru.itmo.java.basics.lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.MessageFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

    // Task.1.1
//        System.out.println("Я\nхорошо\nзнаю\nJava");
    // Task.1.2
        Show("Я хорошо знаю Java.");


    //Task.2
        double expression1 = (46 + 10) * (10 /3d);
        short expression2 = 29 * 4 * -15;
        System.out.println(MessageFormat.format("Output Task.2 expression1: {0} :",expression1));
        System.out.println(MessageFormat.format("Output Task.2 expression2: {0} :",expression2));

    //Task.3
        int number = 10500;
        int result = (number/10)/10;
        System.out.println(MessageFormat.format("Output    Task.3:  {0}",result));

    //Task.4
        double result1 = 3.6 * 4.1 * 5.9; // можно и float  - float result1 = (float)(3.6 * 4.1 * 5.9);
        System.out.println(MessageFormat.format("Output Task.4: {0}",result1));
    //Task.5

        System.out.println("Task.5:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numb1 = Integer.parseInt(reader.readLine());
        int numb2 = Integer.parseInt(reader.readLine());
        int numb3 = Integer.parseInt(reader.readLine());
        System.out.println(MessageFormat.format("{0}\n{1}\n{2}",numb1,numb2,numb3));

    //Task.6
        System.out.println("Task.6:");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int b = in.nextInt();
        if (b % 2 == 0 && b > 100){
            System.out.print("Выход за пределы диапазона");
        }else if (b % 2 == 0) {
            System.out.print("Четное");

        }else{
            System.out.print("Нечетное");
        }

    }








    public static void Show(String offer){
        System.out.println("Output Task.1.2:");
        String[] ws = offer.split(" ");
        for (String i : ws){
            System.out.println(i);
        }

    }
}
