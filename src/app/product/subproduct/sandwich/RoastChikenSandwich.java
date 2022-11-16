package app.product.subproduct.sandwitch;

import app.product.subproduct.*;

public class RoastChikenSandwich extends Sandwich {
    private String main = "Chiken";
    private MainIngredient mainIngredient = new MainIngredient(main);


    public RoastChikenSandwich(String name, int price, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauces[] sauce, String main, MainIngredient mainIngredient1) {
        super(name, price, calorie, mainIngredient, bread, cheeses, vegetables, sauce);
        this.main = main;
        this.mainIngredient = mainIngredient1;
    }
}
