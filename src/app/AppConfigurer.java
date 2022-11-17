package app;

import app.product.subproduct.Sandwich;

public class AppConfigurer {


    public Menu menu() {return new Menu();}
    public Sandwich sandwich() { return new Sandwich();}
}
