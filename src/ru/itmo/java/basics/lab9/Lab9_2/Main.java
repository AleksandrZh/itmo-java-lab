package ru.itmo.java.basics.lab9.Lab9_2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        List<Integer> linkedList = new LinkedList<>();

        Integer amountOfElements = 1_000_000;
        Integer numberOfElements = 10_000;

        addElementsToLists(arrayList, amountOfElements);

        addElementsToLists(linkedList, amountOfElements);


        selectItems(arrayList, numberOfElements);
        selectItems(linkedList, numberOfElements);



        //System.out.println(arrayList.size());

        //System.out.println(arrayList.size());

        }

    public static  List<Integer> addElementsToLists(List<Integer> list, Integer amountOfElements ) {
        Random random = new Random();
        for (int i = 0; i < amountOfElements; i++) {
            list.add(random.nextInt(1000));
        }
        return list;
    }

    public static void selectItems(List<Integer> list, Integer numberOfElements){
        Random random = new Random();

        long stop;
        long start = System.currentTimeMillis (); //System.nanoTime();
        for (int i = 0; i < numberOfElements ; i++) {
            int rI = random.nextInt(list.size());
            Integer rE = list.get((rI));
        }
        stop = System.currentTimeMillis ();//System.nanoTime();
        System.out.println("Время выборки равно:" + list.getClass().getName() + ": "  +  (stop - start) + " мс");
    }

}
