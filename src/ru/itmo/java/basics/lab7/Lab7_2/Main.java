package ru.itmo.java.basics.lab7.Lab7_2;

public class Main {
    public static void main(String[] args) {
        Airplane airplane = new Airplane();
        airplane.show();

        Airplane.Wing wing1 = new Airplane.Wing(456);
        Airplane.Wing wing2 = new Airplane.Wing(678);
        wing1.showWingWeight();
        wing2.showWingWeight();

    }

}
