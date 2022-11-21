package app;

import app.product.ProductRepository;
import app.product.subproduct.Sandwich;

public class AppConfigurer {

    private Cart cart = new Cart(productReposigory(), menu(), cart());
    public Menu menu() {return new Menu();}
    public Order order() {return new Order();}
    public Cart cart() {return cart;}


    public ProductRepository productReposigory() { return new ProductRepository(menu(),order());}
}
