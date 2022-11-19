package app.product.subproduct.otherIngredient;

import app.product.subproduct.OtherIngredients;

public class Omelette extends OtherIngredients {
    private String name;
    private int calorie;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCalorie() {
        return calorie;
    }

    public Omelette() {
        super("Omelette", 80);
    }
}
