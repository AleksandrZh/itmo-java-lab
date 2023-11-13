package ru.itmo.java.basics.lab6.Lab6_4;

public class Child extends Parent {

    public Child(int i) {
        super(i);
    }

    @Override
    public void show() {
        super.show();
        System.out.println(super.i);
    }
}
