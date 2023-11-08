package ru.itmo.java.basics.lab5.Lab5_5;

public class Main {
    public static void main(String[] args) {
        String string = "This is test string";
        reverseString(string);
    }

    public static void reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        string = String.valueOf(builder.reverse());
        String[] array = new String[4];
        int i = 0;
        for (String word : string.split(" ")) {
            System.out.println(word);
            array[i] = word;
            i++;
        }
        for (int j = array.length - 1; j >= 0; j--) {
            System.out.print(array[j] + ' ');
        }
    }
}
