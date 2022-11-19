package app;

import app.product.subproduct.*;
import app.product.subproduct.sandwich.EggMayoSandwich;
import app.product.subproduct.sandwich.ItalianBMTSandwich;
import app.product.subproduct.sandwich.RoastChikenSandwich;
import app.product.subproduct.sandwich.VegetarianSandwich;

import java.util.Scanner;

public class Order {
    private Cart cart;

    private int id=1;

    public void makeOrder(String name, int calorie, MainIngredient mainIngredient, Bread bread, Cheese[] cheeses, Vegetable[] vegetables, Sauce[] sauces,OtherIngredients[] otherIngredients) {
       Sandwich sandwich;
        switch (name){
            case "chiken": new RoastChikenSandwich(id,calorie,mainIngredient,bread,cheeses,vegetables,sauces,otherIngredients); break;
            case "eggmayo": new EggMayoSandwich(id,calorie,mainIngredient,bread,cheeses,vegetables,sauces,otherIngredients);break;
            case "BMT":new ItalianBMTSandwich(id,calorie,mainIngredient,bread,cheeses,vegetables,sauces,otherIngredients);break;
            case "vege":new VegetarianSandwich(id,calorie,mainIngredient,bread,cheeses,vegetables,sauces,otherIngredients);break;
            default: break;
        }
        id++;

    }


}
