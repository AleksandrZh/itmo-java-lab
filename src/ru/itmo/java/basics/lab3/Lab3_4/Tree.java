package ru.itmo.java.basics.lab3.Lab3_4;

public class Tree {

    private String name;
    private int age;
    private Boolean isLiving;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, int age, Boolean isLiving) {
        this.name = name;
        this.age = age;
        this.isLiving = isLiving;
    }
    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }


}
