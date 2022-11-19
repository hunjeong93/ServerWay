package app.product.subproduct;

import app.product.Product;

public class Sandwich extends Product {
    private MainIngredient mainIngredient;
    private Bread bread;
    private Cheese[] cheeses;
    private Vegetable[] vegetables;
    private Sauce[] sauce;
    private OtherIngredients[] otherIngredients;

    public OtherIngredients[] getOtherIngredients() {
        return otherIngredients;
    }

    public void setOtherIngredients(OtherIngredients[] otherIngredients) {
        this.otherIngredients = otherIngredients;
    }






    public MainIngredient getMainIngredient() {
        return mainIngredient;
    }

    public void setMainIngredient(MainIngredient mainIngredient) {
        this.mainIngredient = mainIngredient;
    }

    public Bread getBread() {
        return bread;
    }

    public void setBread(Bread bread) {
        this.bread = bread;
    }

    public Cheese[] getCheeses() {
        return cheeses;
    }

    public void setCheeses(Cheese[] cheeses) {
        this.cheeses = cheeses;
    }

    public Vegetable[] getVegetables() {
        return vegetables;
    }

    public void setVegetables(Vegetable[] vegetables) {
        this.vegetables = vegetables;
    }

    public Sauce[] getSauce() {
        return sauce;
    }

    public void setSauce(Sauce[] sauce) {
        this.sauce = sauce;
    }



    public Sandwich(int id, String name, int price, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauce[] sauce, OtherIngredients[] otherIngredients) {
        super(id, name, price, calorie);
        this.mainIngredient = mainIngredient;
        this.bread = bread;
        this.cheeses = cheeses;
        this.vegetables = vegetables;
        this.sauce = sauce;
        this.otherIngredients = otherIngredients;
    }

    public Sandwich(String name, int price, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauce[] sauce, OtherIngredients[] otherIngredients) {
        super(name, price, calorie);
        this.mainIngredient = mainIngredient;
        this.bread = bread;
        this.cheeses = cheeses;
        this.vegetables = vegetables;
        this.sauce = sauce;
        this.otherIngredients = otherIngredients;
    }
}
