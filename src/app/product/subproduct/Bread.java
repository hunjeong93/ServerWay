package app.product.subproduct;


import app.product.Product;

public class Bread {
    private String name;
    private int Calories;
    private boolean longSize; // false = 15cm ,  true = 30cm
    private boolean baked; // false = 안구움 , true = 구움

    public String getName() {
        return name;
    }

    public int getCalories() {
        return Calories;
    }

    public boolean isLongSize() {
        return longSize;
    }

    public boolean isBaked() {
        return baked;
    }

    public Bread(String name, int calories, boolean longSize, boolean baked) {
        this.name = name;
        this.Calories = calories;
        this.longSize = longSize;
        this.baked = baked;
    }
}
