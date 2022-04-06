package com.company.homework7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat (Plate plate){
        if (checkFoodQuantity(plate)){
            System.out.printf("%s начал есть, сьел %d %n ", this.name, appetite);
            plate.descreaseFood(this,appetite);
            this.satiety = true;
        }
    }

    public boolean checkFoodQuantity(Plate plate) {
        return plate.isFoofEnough(appetite);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

}
