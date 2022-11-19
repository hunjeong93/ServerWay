package app.product;

import app.Menu;
import app.Order;
import app.product.subproduct.*;
import app.product.subproduct.bread.HoneyOat;
import app.product.subproduct.bread.WheatBread;
import app.product.subproduct.bread.WhiteBread;
import app.product.subproduct.cheese.AmericanCheese;
import app.product.subproduct.cheese.MozzarellaCheese;
import app.product.subproduct.otherIngredient.*;
import app.product.subproduct.sandwich.RoastChikenSandwich;
import app.product.subproduct.sauce.*;
import app.product.subproduct.vegetable.*;

import java.util.Scanner;

public class ProductRepository {
    private String name;
    private MainIngredient mainIngredient;
    private Bread bread;
    private Cheese[] cheeses = new Cheese[2];

    private Vegetable[] vegetables = new Vegetable[6];

    private Sauce[] sauces = new Sauce[3];
    private OtherIngredients[] otherIngredients = new OtherIngredients[5];

    private int calorie;
    private boolean longSize = true; // 디폴트 30cm
    private boolean baked = true; //디폴트 구움
    boolean check=true;
    private Menu menu;
    private Order order;

    public ProductRepository(Menu menu) {
        this.menu = menu;
    }

    public void makeSandwich() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        selectSandwich(input);
        selectBread(scanner);
        selectCheese(scanner);
        removeVegetable(scanner);

        menu.choiceSauce();
        int count =0;
        check = true;
        while(check){
            input = scanner.nextInt();
            if(input==0 || input ==6) {
                check = !check;
                break;
            }
            switch (input) {
                case 1: sauces[count] = new Mustard(); break;
                case 2: sauces[count] = new SweetOnion(); break;
                case 3: sauces[count] = new SmokedBarbecue(); break;
                case 4: sauces[count] = new Ranch(); break;
                case 5: sauces[count] = new OliveOil(); break;
                default: break;
            }
            count++;
            if (count ==3) break;

        }

        menu.addIngredient();
        count=0;
        check = true;
        while (check) {
            input = scanner.nextInt();
            if(input==0 || input ==6) {
                check = !check;
                break;
            }
            switch (input) {
                case 1: otherIngredients[count] = new EggMayo(); break;
                case 2: otherIngredients[count] = new Peperony(); break;
                case 3: otherIngredients[count] = new Bacon(); break;
                case 4: otherIngredients[count] = new Avocado(); break;
                case 5: otherIngredients[count] = new Omelette(); break;
                default: break;
            }
            count++;
            if(count==5) break;
        }

        int cheeseCalorie=0;
        try {
            for (int i = 0; i < cheeses.length; i++) {
                cheeseCalorie += cheeses[i].getCalorie();
            }
        } catch (NullPointerException e) {
            System.out.println(e +"치즈 없음");
        }
        int vegeCalorie=0;
        for (int i = 0; i < vegetables.length; i++) {
            vegeCalorie += vegetables[i].getCalorie();
        }
        int sauceCalorie=0;
        for (int i = 0; i < sauces.length; i++) {
            sauceCalorie += sauces[i].getCalorie();
        }
        int otherCalorie=0;
        for (int i = 0; i < otherIngredients.length; i++) {
            otherCalorie += otherIngredients[i].getCalorie();
        }
        calorie = bread.getCalorie() + cheeseCalorie + vegeCalorie +sauceCalorie +otherCalorie;

       order.makeOrder(name, calorie,mainIngredient,bread,cheeses,vegetables,sauces,otherIngredients);


    }

    private void selectSandwich(int input) {
        switch (input) {
            case 1:
                mainIngredient = new MainIngredient("chiken");
                    name ="chiken";
                break;
            case 2:
                mainIngredient = new MainIngredient("eggmayo");
                name ="eggmayo";
                break;
            case 3:
                mainIngredient = new MainIngredient("BMT");
                name ="BMT";
                break;
            case 4:
                mainIngredient = new MainIngredient("vege");
                name ="vege";
                break;
            default:
                System.out.println("잘못된 입력입니다. 1~4 메뉴 중 선택하여주세요.");
                makeSandwich();
                break;
        }
    }

    private void selectBread(Scanner scanner) {
        int input;
        menu.choiceBread();

        //길이선택
        input = scanner.nextInt();
        if (input == 1) longSize = false; //15cm
        else longSize = true; // 30cm

        //굽기선택
        input = scanner.nextInt();
        if (input == 2) baked = false; //안구움
        else baked = true; //구움

        //빵 종류선택
        input = scanner.nextInt();
        if (input == 1) {
            bread = new HoneyOat(longSize, baked);
        } else if (input == 2) {
            bread = new WheatBread(longSize, baked);
        } else if (input == 3) {
            bread = new WhiteBread(longSize, baked);
        } else {
            System.out.println("잘못된 번호 입니다. 기본 빵(HoneyOat)이 선택됩니다.");
            bread = new HoneyOat(longSize, baked);
        }
    }

    private void selectCheese(Scanner scanner) {
        int input;
        menu.choiceCheese();
        //치즈 1차 선택
        input = scanner.nextInt();
        if (input == 3) {
            System.out.println("치즈를 제외 합니다.");
            System.out.println("-".repeat(60));
        } else if (input == 1) {

            cheeses[0] = new AmericanCheese();
            menu.addCheese();
            input = scanner.nextInt(); //치즈 추가 선택
            if (input == 1) {
                cheeses[1] = new AmericanCheese();
            } else if (input == 2) {
                cheeses[1] = new MozzarellaCheese();
            } else {
                System.out.println("치즈를 추가하지 않습니다. americanCheese 1개 선택하셨습니다.");
            }
        } else if (input == 2) {
            cheeses[0] = new MozzarellaCheese();
            menu.addCheese();
            input = scanner.nextInt(); // 치즈 추가 선택
            if (input == 2) {
                cheeses[1] = new MozzarellaCheese();
            } else if (input == 1) {
                cheeses[1] = new AmericanCheese();
            } else {
                System.out.println("치즈를 추가하지 않습니다. mozzarellaCheese 1개 선택하셨습니다.");
            }
        } else {
            System.out.println("치즈를 제외 합니다.");
            cheeses = null;
            System.out.println("-".repeat(60));
        }
    }

    private void removeVegetable(Scanner scanner) {
        int input;
        menu.removeVege();
        createVegetable();

        int count =0;
        check=true;
        while(check){
            input = scanner.nextInt();
            if(input ==1 || input ==0) {
                check = !check;
                break;
            }
            vegetables[input-2] = null;
            count++;
            if(count ==6) break;

        }
    }

    private void createVegetable() {
        vegetables[0] = new Lettuce();
        vegetables[1] = new Tomato();
        vegetables[2] = new Cucumber();
        vegetables[3] = new Pickle();
        vegetables[4] = new Olive();
        vegetables[5] = new Jalapenos();
    }
}
