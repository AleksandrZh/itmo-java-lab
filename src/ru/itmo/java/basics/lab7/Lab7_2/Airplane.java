package ru.itmo.java.basics.lab7.Lab7_2;

public class Airplane {

    public void show(){
        Wing wing = new Wing(3453);
        wing.showWingWeight();
    }


    static class Wing{
        double weightWing;

        public Wing(double weightWing) {
            this.weightWing = weightWing;
        }

        void showWingWeight(){
            System.out.println(weightWing);
        }


    }


}
