package app.product.subproduct.soup;

import app.product.subproduct.Soup;

public class MushroomSoup extends Soup {
    public MushroomSoup() {
        super("mushroomSoup", 1700, 350);
    }

    public MushroomSoup(int id) {
        super(id, "mushroomSoup", 1700, 350);
    }
}
