package ru.itmo.java.basics.lab3.Lab3_2;

public class Car {
    private String color;
    private String name;
    private Double weight;

    public Car(){
    };
    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car(String name, String color, Double weight){
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public void Show(){
        System.out.println(name);
        System.out.println(color);
        System.out.println(weight);
    }
}
