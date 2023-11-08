package ru.itmo.java.basics.lab3.Lab3_3;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        building.InitializeBuilding("Репинский", 1970, 9);
        building.Show();
        building.NumberOfYears();

        Building building1 = new Building();
        building.InitializeBuilding("Дом у моря", 1967, 5);
        building.Show();
        building.NumberOfYears();

    }
}
