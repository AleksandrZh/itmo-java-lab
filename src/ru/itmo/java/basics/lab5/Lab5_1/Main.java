package ru.itmo.java.basics.lab5.Lab5_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String text = "Есть много вариантов Lorem Ipsum, но большинство из них имеет не всегда приемлемые модификации, например, юмористические вставки или слова, которые даже отдалённо не напоминают латынь. Если вам нужен Lorem Ipsum для серьёзного проекта, вы наверняка не хотите какой-нибудь шутки, скрытой в середине абзаца. Также все другие известные генераторы Lorem Ipsum используют один и тот же текст, который они просто повторяют, пока не достигнут нужный объём. Это делает предлагаемый здесь генератор единственным настоящим Lorem Ipsum генератором. Он использует словарь из более чем 200 латинских слов, а также набор моделей предложений. В результате сгенерированный Lorem Ipsum выглядит правдоподобно, не имеет повторяющихся абзацей или невозможных слов.";
        // убрал пунктуацию
        text = removePunctuation(text);
        //System.out.println(text);
        //поиск большого слова
        findBigWord(text);
    }

    public static String removePunctuation(String text) {
        return text.replaceAll("\\p{Punct}", "");
    }

    public static void findBigWord(String text) {
        int maxLength = 0;
        for (String word : text.split(" ")) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        for (String word : text.split(" ")) {
            if (word.length() == maxLength) {
                System.out.println(word);
            }

        }

    }

}
