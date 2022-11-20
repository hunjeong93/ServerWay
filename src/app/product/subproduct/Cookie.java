package app.product.subproduct;

import app.product.Product;

public class Cookie extends Product {
    public Cookie(String name, int price, int calorie) {
        super(name, price, calorie);
    }

    public Cookie(int id, String name, int price, int calorie) {
        super(id, name, price, calorie);
    }
}
