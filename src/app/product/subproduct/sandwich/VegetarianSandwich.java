package app.product.subproduct.sandwich;

import app.product.subproduct.*;

public class VegetarianSandwich extends Sandwich {
    private int id;
    private int calorie;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public int getCalorie() {
        return calorie;
    }

    public VegetarianSandwich(int id, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauce[] sauce, OtherIngredients[] otherIngredients) {
        super(id, "VegetarianSandwich", 5500, calorie, mainIngredient, bread, cheeses, vegetables, sauce, otherIngredients);
        this.calorie = calorie;
        this.id = id;
    }
}
