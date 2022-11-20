package app.product.subproduct;

import app.product.Product;

public class Soup extends Product {
    public Soup() {
    }

    public Soup(String name, int price, int calorie) {
        super(name, price, calorie);
    }

    public Soup(int id, String name, int price, int calorie) {
        super(id, name, price, calorie);
    }
}
