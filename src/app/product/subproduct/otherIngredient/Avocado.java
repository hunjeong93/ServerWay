package app.product.subproduct.otherIngredient;

import app.product.subproduct.OtherIngredients;

public class Avocado extends OtherIngredients {
    private String name;
    private int calorie;


    public String getName() {
        return name;
    }


    public int getCalorie() {
        return calorie;
    }

    public Avocado() {
        super("avocado", 3);
    }
}
