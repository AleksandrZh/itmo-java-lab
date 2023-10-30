package ru.itmo.java.basics.lab2.lab2_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.addition(10, 6));
        System.out.println(Calculator.addition(3223372036854775808L, 1223372036854775808L));
        System.out.println(Calculator.addition(34.45, 56.57));

        System.out.println(Calculator.division(10, 5));
        System.out.println(Calculator.division(3223372036854775808L, 122036854775808L));
        System.out.println(Calculator.division(34.45, 56.57));

        System.out.println(Calculator.subtraction(10, 5));
        System.out.println(Calculator.subtraction(3223372036854775808L, 12453372036854778L));
        System.out.println(Calculator.subtraction(34.45, 56.57));

        System.out.println(Calculator.multiplication(10, 5));
        System.out.println(Calculator.multiplication(3223378L, 12234563L));
        System.out.println(Calculator.multiplication(34.45, 56.57));
    }
}
