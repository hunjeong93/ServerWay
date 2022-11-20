package app.product.subproduct.soup;

import app.product.subproduct.Soup;

public class BroccoliSoup extends Soup {
    public BroccoliSoup() {
        super("broccoliSoup", 1600, 350);
    }

    public BroccoliSoup(int id) {
        super(id, "broccoliSoup", 1600, 350);
    }
}
