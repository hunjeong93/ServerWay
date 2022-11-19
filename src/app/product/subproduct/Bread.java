package app.product.subproduct;


import app.product.Product;

public class Bread {
    private String name;
    private int Calorie;
    private boolean longSize; // false = 15cm ,  true = 30cm
    private boolean baked; // false = 안구움 , true = 구움

    public String getName() {
        return name;
    }

    public int getCalorie() {
        return Calorie;
    }

    public boolean isLongSize() {
        return longSize;
    }

    public boolean isBaked() {
        return baked;
    }

    public Bread(String name, int Calorie, boolean longSize, boolean baked) {
        this.name = name;
        this.Calorie = Calorie;
        this.longSize = longSize;
        this.baked = baked;
    }
}
