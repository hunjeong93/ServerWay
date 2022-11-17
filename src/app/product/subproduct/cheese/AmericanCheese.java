package app.product.subproduct.cheese;

import app.product.subproduct.Cheese;

public class AmericanCheese extends Cheese {
    private String name;
    private int calories;

    public AmericanCheese(String name, int calories) {
        super(name, calories);
        this.name = name;
        this.calories =calories;
    }
}
