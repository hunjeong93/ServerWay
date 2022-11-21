package app;

import app.product.ProductRepository;
import app.product.subproduct.Sandwich;

import java.util.Scanner;

public class OrderApp {
    private final app.Cart Cart;
    private Menu menu;
    private Cart cart;
    private ProductRepository productRepository;
    private Order order;

    public OrderApp(Menu menu, ProductRepository productRepository, Cart cart) {
        this.menu = menu;
        this.productRepository = productRepository;
        this.Cart = cart;
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

                        break;
                    case 2:
                        menu.choiceSide();
                        break;
                    case 3://세트
                        menu.choiceSet();
                        menu.choiceSandwich();
                        productRepository.makeSandwich();
                        menu.choiceSide();
                        break;
                    case 4://콤보
                        menu.choiceCombo();
                        menu.choiceSandwich();
                        productRepository.makeSandwich();
                        menu.choiceDrink();

                }
            } else if (input.equals("2")) {
                cart.printCart();
            }
        }
    }
}

