package ru.itmo.java.basics.lab6.Lab6_5;



public class Child extends Parent {

    private String name;

    public Child() {
        super.age = 45;
    }

    @Override
    public void inputField() {
        this.name = super.in.nextLine();
    }


}
