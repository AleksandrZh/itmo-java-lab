package ru.itmo.java.basics.lab6.Lab6_1;

public class Client extends Human {

    private String bankName;
    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    void show() {
        System.out.println("Имя: " + name + " Фамилия: " + surname + " Банк: " + bankName);
    }
}
