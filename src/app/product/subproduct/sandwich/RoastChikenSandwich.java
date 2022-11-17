package app.product.subproduct.sandwich;

import app.product.subproduct.*;

public class RoastChikenSandwich extends Sandwich {
    private String main = "chiken";

    private int colories = 200;
    public String getMain() {
        return main;
    }

    public int getColories() {
        return colories;
    }

    public RoastChikenSandwich(int id, String name, int price, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauces[] sauce) {
        super(id, name, price, calorie, mainIngredient, bread, cheeses, vegetables, sauce);
    }

    public RoastChikenSandwich(String name, int price, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauces[] sauce) {
        super(name, price, calorie, mainIngredient, bread, cheeses, vegetables, sauce);
    }
}
