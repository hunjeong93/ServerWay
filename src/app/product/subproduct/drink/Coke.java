package app.product.subproduct.drink;

import app.product.subproduct.Drink;

public class Coke extends Drink {
    public Coke() {
        super("coke", 1000, 145);
    }

    public Coke(int id) {
        super(id, "coke", 1000, 145);
    }
}
