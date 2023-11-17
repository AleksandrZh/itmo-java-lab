package ru.itmo.java.basics.lab9.Lab9_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        List<Integer> collections = new ArrayList<>();

        collections.add(44);
        collections.add(345);
        collections.add(14);
        collections.add(14);
        collections.add(1234);
        collections.add(135);
        collections.add(44);

        System.out.println(removeDublicate(collections));


    }

    public static Set<Integer> removeDublicate(List<Integer> collection) {

        Set<Integer> noDublicate;
        noDublicate = new HashSet<>(collection);

        return noDublicate;
    }


}
