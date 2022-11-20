package app.product.subproduct;

import app.product.Product;

public class Drink extends Product {
    private String name;
    private int calorie;
    private int price;

    public Drink(String name, int price, int calorie) {
        super(name, price, calorie);
    }

    public Drink(int id, String name, int price, int calorie) {
        super(id, name, price, calorie);
    }
}
