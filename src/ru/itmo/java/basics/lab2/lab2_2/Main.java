package ru.itmo.java.basics.lab2.lab2_2;

public class Main {
    public static void main(String[] args) {
        Document document = new Document("Contract");
        document.setBody("Body contract");
        document.setFooter("CIO Жмакин А.А.");

        document.Show();

    }
}
