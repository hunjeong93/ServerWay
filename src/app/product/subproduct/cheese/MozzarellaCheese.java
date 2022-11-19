package app.product.subproduct.cheese;

import app.product.subproduct.Cheese;

public class MozzarellaCheese extends Cheese {
    private String name;
    private int colories;

    public String getName() {
        return name;
    }

    public int getColories() {
        return colories;
    }

    public MozzarellaCheese() {
        super("mozzarellaCheese", 13);
    }
}
