package com.company.homework7;

public class TestPlate {
    public static void main(String[] args) {
        Cat [] cats = new Cat[]{
                new Cat ("Barsik", 7),
                new Cat ("Murzik", 15),
                new Cat ("Lionea", 10),
                new Cat ("Bars", 15)
        };

        Plate plate = new Plate(25);

        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.printf("Кот %s сытость на данный момент %s %n" ,cat.getName(),cat.isSatiety());
        }
    }
}