package app.product.subproduct;

import app.product.Product;

public class Chip extends Product {
    private String name;
    private int calorie;
    private int price;



    public Chip(String name, int price, int calorie) {
        super(name, price, calorie);
    }

    public Chip(int id, String name, int price, int calorie) {
        super(id, name, price, calorie);
    }
}
