package ru.itmo.java.basics.lab6.Lab6_1;

public abstract class Human {

    protected String name;

    protected String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    abstract void show();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
