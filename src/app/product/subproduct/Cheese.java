package app.product.subproduct;


import app.product.subproduct.cheese.AmericanCheese;

public class Cheese {

    private String name;
    private int calorie;

    public String getName() {
        return name;
    }

    public int getCalorie() {
        return calorie;
    }

    public Cheese(String name, int calorie) {
        this.name = name;
        this.calorie = calorie;
    }




}
