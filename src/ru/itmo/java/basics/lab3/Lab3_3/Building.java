package ru.itmo.java.basics.lab3.Lab3_3;

import java.text.MessageFormat;
import java.time.LocalDate;

public class Building {
    private String name;
    private Integer year;
    private Integer floor;

    public void InitializeBuilding(String name, Integer year, Integer floor){
        this.name = name;
        this.year = year;
        this.floor = floor;
    }

    public void Show(){
        System.out.println(name);
        System.out.println(year);
        System.out.println(floor);
    }

    public void NumberOfYears(){
        LocalDate date = LocalDate.now();
        int currentYear = date.getYear();
        System.out.println(MessageFormat.format("C момента постройки прошло: {0} ", currentYear - this.year ));
    }




}
