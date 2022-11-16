package app.product.subproduct;

import app.product.Ingredient;
import app.product.Product;

public class Bread extends Ingredient {
    private String name;
    private int Calories;
    private boolean longSize; // false = 15cm ,  true = 30cm
    private boolean baked; // false = 안구움 , true = 구움

    public Bread(String name, int calories, boolean longSize, boolean baked) {
        this.name = name;
        this.Calories = calories;
        this.longSize = longSize;
        this.baked = baked;
    }
}
