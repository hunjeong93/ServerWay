package app.product.subproduct.bread;

import app.product.subproduct.Bread;

public class HoneyOat extends Bread {
    private String name;
    private int calories;

    private boolean longSize;

    private boolean baked;



    public HoneyOat(boolean longSize, boolean baked) {
        super("honeyOat", 110, longSize, baked);
        this.longSize = longSize;
        this.baked = baked;

    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public boolean isLongSize() {
        return longSize;
    }

    public boolean isBaked() {
        return baked;
    }
}
