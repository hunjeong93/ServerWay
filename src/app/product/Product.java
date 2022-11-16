package app.product;

public class Product {
    private int id;
    private String name;
    private int price;
    private int calorie;

    public Product(String name, int price, int calorie) {
        this.name = name;
        this.price = price;
        this.calorie = calorie;
    }

    public Product(int id, String name, int price, int calorie) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.calorie = calorie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }
}
