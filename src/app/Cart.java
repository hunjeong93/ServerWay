package app;

import app.product.ProductRepository;
import app.product.subproduct.Sandwich;

import java.util.Scanner;

public class Cart {
    private Sandwich[] sandwiches = new Sandwich[0];
    private Scanner scanner = new Scanner(System.in);
    private ProductRepository productRepository;
    private Menu menu;

    public Cart(ProductRepository productRepository, Menu menu) {
        this.productRepository = productRepository;
        this.menu = menu;
    }

    public void printCart() {
        System.out.println("🛒 장바구니\n");

        printCartItemDetails();
    }

    private void printCartItemDetails() {
        for (Sandwich sandwich : sandwiches) {
            System.out.println("(단품)");
        }
    }
}
