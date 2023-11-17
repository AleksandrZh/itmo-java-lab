package ru.itmo.java.basics.lab9.Lab9_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Alex"), 456);
        map.put(new User("Kris"), 4348);
        map.put(new User("Katie"), 2);
        map.put(new User("Bob"), 523);
        map.put(new User("Mike"), 423847);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        show(map, name);
    }

    public static void show(Map<User, Integer> map, String name){
        for (Map.Entry<User, Integer> pair : map.entrySet()) {
            String pairKey = String.valueOf(pair.getKey().getName());
            Integer pairValue = pair.getValue();

            if (Objects.equals(pairKey, name)){
                System.out.println("Пользователь: " + pairKey + " заработал: " + pairValue + " очков");
            }

        }


    }
}
