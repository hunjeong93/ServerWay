package app;

import app.product.ProductRepository;
import app.product.subproduct.Sandwich;

public class AppConfigurer {


    public Menu menu() {return new Menu();}
    public Order order() {return new Order();}


    public ProductRepository productReposigory() { return new ProductRepository(menu(),order());}
}
