package ru.itmo.java.basics.lab6.Lab6_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ввод числа");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число:");
        int i = in.nextInt();

        Parent child = new Child(i);
        child.show();
    }
}
