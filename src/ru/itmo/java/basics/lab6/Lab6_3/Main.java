package ru.itmo.java.basics.lab6.Lab6_3;

public class Main {
    public static void main(String[] args) {
        // метод запускается если создавать объект непосредственно Lorry
        Car lorry = new Lorry(19500, "Камаз", 'G', 120, 8, 35000);

        lorry.newWheels(34678);
    }
}
