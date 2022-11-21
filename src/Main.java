import app.AppConfigurer;
import app.OrderApp;

public class Main {
    public static void main(String[] args) {
        AppConfigurer appConfigurer = new AppConfigurer();


        OrderApp orderApp = new OrderApp(
                appConfigurer.menu(),
                appConfigurer.productReposigory(),
                appConfigurer.cart()


        );

        orderApp.start();
    }
}