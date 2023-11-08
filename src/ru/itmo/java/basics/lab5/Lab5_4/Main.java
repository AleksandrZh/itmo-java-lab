package ru.itmo.java.basics.lab5.Lab5_4;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String text = "Давно выяснено, что при оценке дизайна и композиции читаемый текст мешает сосредоточиться. Lorem Ipsum используют потому, что тот обеспечивает более или менее стандартное дизайна заполнение шаблона, а также реальное распределение букв и пробелов в абзацах, которое дизайна не получается дизайна при простой дубликации ";
        String subtext = "дизайна";
        text = removePunctuation(text);

        countSubstring(text, subtext);
    }

    public static String removePunctuation(String text) {
        return text.replaceAll("\\p{Punct}", "");
    }

    public static void countSubstring(String text, String subtext) {
        int count = 0;
        for (String word : text.split(" ")) {
            if (Objects.equals(word, subtext)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
