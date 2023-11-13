package ru.itmo.java.basics.lab6.Lab6_5;

import javax.naming.PartialResultException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Parent {
    protected String name;
    protected int age;
    protected Scanner in;

    public Parent(){
        in = new Scanner(System.in);
    }

    public void inputField(){
        System.out.print("Введите возраст:");
        this.age = in.nextInt();

    }

}
