package app.product.subproduct.sandwich;

import app.product.subproduct.*;

public class EggMayoSandwich extends Sandwich{
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

    public EggMayoSandwich(int id, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauce[] sauce, OtherIngredients[] otherIngredients) {
        super(id, "EggMayoSandwich", 5800, calorie, mainIngredient, bread, cheeses, vegetables, sauce, otherIngredients);
        this.calorie = calorie;
        this.id = id;
    }
}
