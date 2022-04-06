package com.company.homework7;

public class Plate {

    private int foodQuantity;

    public Plate (int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void info() {
        System.out.println("Текущее количество еды " + foodQuantity);
    }

    public void descreaseFood(Cat cat, int foodQuantity) {
        this.foodQuantity -= foodQuantity;
    }

    public void addingFood(int foodQuantity){
        this.foodQuantity += foodQuantity;

    }
    public boolean isFoofEnough(int foodCount){
        return this.foodQuantity >= foodCount;
    }
}