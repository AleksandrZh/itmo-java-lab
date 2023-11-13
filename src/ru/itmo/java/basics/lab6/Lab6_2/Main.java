package ru.itmo.java.basics.lab6.Lab6_2;

public class Main {
    public static void main(String[] args) {
        Human client = new Client("Егор", "Иванов", "Газпромбанк");
        Human bankEmployee = new BankEmployee("Валерий", "Петров", "ВТБ");

        client.show();
        bankEmployee.show();

    }
}
