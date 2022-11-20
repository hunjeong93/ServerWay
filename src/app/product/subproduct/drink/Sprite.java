package app.product.subproduct.drink;

import app.product.subproduct.Drink;

public class Sprite extends Drink {
    public Sprite() {
        super("sprite", 1200, 140);
    }

    public Sprite(int id) {
        super(id, "sprite", 1200, 140);
    }
}
