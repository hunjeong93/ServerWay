package app.product.subproduct.drink;

import app.product.subproduct.Drink;

public class Americano extends Drink {
    public Americano() {
        super("americano", 1500, 7);
    }

    public Americano(int id) {
        super(id, "americano", 1500, 7);
    }
}
