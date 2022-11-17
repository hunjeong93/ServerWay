package app.product.subproduct;



public class Cheese {

    private String name;
    private int calories;

    private String name2;

    public Cheese(String name, int calories) {
        this.name =name;
        this.calories =calories;
    }

    public Cheese(String name, String name2, int calories) {
        this.name = name;
        this.name2 = name2;
        this.calories = calories;
    }
}
