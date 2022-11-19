package app.product.subproduct.otherIngredient;

import app.product.subproduct.OtherIngredients;

public class Bacon extends OtherIngredients {
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

    public Bacon() {
        super("Bacon", 50);
    }
}
