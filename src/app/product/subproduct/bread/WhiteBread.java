package app.product.subproduct.bread;

import app.product.subproduct.Bread;

public class WhiteBread extends Bread {
    private String name;
    private int calories;

    private boolean longSize;

    private boolean baked;

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public WhiteBread(String name, int calories, boolean longSize, boolean baked) {
        super(name, calories, longSize, baked);
    }
}
