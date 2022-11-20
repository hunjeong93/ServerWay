package app.product.subproduct.soup;

import app.product.subproduct.Soup;

public class Hashbrown extends Soup {
    public Hashbrown() {
        super("hashbrown", 1800, 600);
    }

    public Hashbrown(int id) {
        super(id, "hashbrown", 1800, 600);
    }
}
