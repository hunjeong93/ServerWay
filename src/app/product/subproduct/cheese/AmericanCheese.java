package app.product.subproduct.cheese;

import app.product.subproduct.Cheese;

public class AmericanCheese extends Cheese {
    private String name;
    private int calories;

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public AmericanCheese() {
        super("americanCheese", 10);
    }
}
