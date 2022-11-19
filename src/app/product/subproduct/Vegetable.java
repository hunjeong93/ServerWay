package app.product.subproduct;

public class Vegetable {
    private String name;
    private int calorie;

    public String getName() {
        return name;
    }

    public int getCalorie() {
        return calorie;
    }

    public Vegetable() {
    }

    public Vegetable(String name, int calorie) {
        this.name = name;
        this.calorie = calorie;
    }
}
