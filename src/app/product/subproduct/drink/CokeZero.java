package app.product.subproduct.drink;

import app.product.subproduct.Drink;

public class CokeZero extends Drink {
    public CokeZero() {
        super("cokeZero", 1000, 0);
    }

    public CokeZero(int id) {
        super(id, "cokeZero", 1000, 0);
    }
}
