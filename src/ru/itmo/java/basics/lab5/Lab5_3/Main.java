package ru.itmo.java.basics.lab5.Lab5_3;

public class Main {
    public static void main(String[] args) {
        String text = "Есть много бяка Lorem Ipsum, но большинство из них бяка не всегда приемлемые модификации, например";
        String source  = "бяка";
        String target = "[вырезано цензурой]";
        replaceByaka(text, source, target);
    }

    public static void replaceByaka(String text, String source, String target) {
        text = text.replace(source, target);
        System.out.println(text);
    }
}
