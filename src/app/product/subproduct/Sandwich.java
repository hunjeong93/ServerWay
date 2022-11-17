package app.product.subproduct;

import app.product.Product;
import app.product.subproduct.sandwich.RoastChikenSandwich;

import java.util.Scanner;

public class Sandwich extends Product {
    private MainIngredient mainIngredient;
    private Bread bread;
    private Cheese[] cheeses;
    private Vegetable[] vegetables;
    private Sauces[] sauce;

    private int calories;





    public Sandwich(String name, int price, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauces[] sauce) {
        super(name, price, calorie);
        this.mainIngredient = mainIngredient;
        this.bread = bread;
        this.cheeses = cheeses;
        this.vegetables = vegetables;
        this.sauce = sauce;
    }

    public Sandwich(int id, String name, int price, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauces[] sauce) {
        super(id, name, price, calorie);
        this.mainIngredient = mainIngredient;
        this.bread = bread;
        this.cheeses = cheeses;
        this.vegetables = vegetables;
        this.sauce = sauce;
    }

}
