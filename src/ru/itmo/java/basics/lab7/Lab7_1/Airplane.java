package ru.itmo.java.basics.lab7.Lab7_1;

public class Airplane {

    class Wing{
        double weightWing;

        public Wing(double weightWing) {
            this.weightWing = weightWing;
        }

        void showWingWeight(){
            System.out.println(weightWing);
        }
    }


    public void wingMethodCall(){
        Airplane.Wing wing = new Airplane.Wing(345);
        wing.showWingWeight();
    }

}
