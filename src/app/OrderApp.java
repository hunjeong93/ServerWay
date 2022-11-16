package app;

import java.util.Scanner;

public class OrderApp {
    private Menu menu;

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-".repeat(60));
        System.out.println("🥪 ServerWay Order Service  🥪 ");
        System.out.println("-".repeat(60));

        System.out.println("[📣] 안녕하세요! ");

        while (true) {
            menu.printEntrance();
        }
    }
}
