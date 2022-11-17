package app;

import app.product.ProductRepository;
import app.product.subproduct.Sandwich;

import java.util.Scanner;

public class OrderApp {
    private Menu menu;
    private ProductRepository productRepository;
    private Order order;

    public OrderApp(Menu menu, ProductRepository productRepository) {
        this.menu = menu;
        this.productRepository = productRepository;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-".repeat(60));
        System.out.println("🥪 ServerWay Order Service  🥪 ");
        System.out.println("-".repeat(60));
        System.out.println("[📣] 안녕하세요! ");


        while (true) {
            menu.printEntrance();
            String input = scanner.next();
            if (input.equals("1")) {
                menu.choiceMenu();
//                order.makeOrder();
                input = scanner.next();
                switch (Integer.parseInt(input)) {
                    case 1:
                        menu.choiceSandwich();
                        productRepository.makeSandwich();
                    case 2:
//                        장바구니

                }
            }
        }
    }
}

