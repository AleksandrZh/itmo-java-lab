package ru.itmo.java.basics.lab5.Lab5_3;

public class Main {
    public static void main(String[] args) {
        String text = "Есть много бяка Lorem Ipsum, но большинство из них бяка не всегда приемлемые модификации, например";
        replaceByaka(text);
    }

    public static void replaceByaka(String text) {
        text = text.replace("бяка", "[вырезано цензурой]");
        System.out.println(text);
    }
}
