package ru.itmo.java.basics.lab6.Lab6_3;

public class Lorry extends Car {

    private int numberWheels;
    private double maxWeight;



    public Lorry(int w, String m, char c, float s, int numberWheels, double maxWeight) {
        super(w, m, c, s);
        this.numberWheels = numberWheels;
        this.maxWeight = maxWeight;
    }

    @Override
    public void newWheels(int i) {
        super.newWheels(i);
        this.maxWeight = i;
        System.out.println("Максимальный вес: " + maxWeight);
    }


}
