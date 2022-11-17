package app.product;

import app.Menu;
import app.product.subproduct.*;
import app.product.subproduct.bread.HoneyOat;
import app.product.subproduct.bread.WheatBread;
import app.product.subproduct.bread.WhiteBread;
import app.product.subproduct.cheese.AmericanCheese;
import app.product.subproduct.cheese.MozzarellaCheese;
import app.product.subproduct.sandwich.RoastChikenSandwich;

import java.util.Scanner;

public class ProductRepository {
    private String mainIngredient;
    private Bread bread;
    private Cheese cheeses;

    private Vegetable[] vegetables;
    private Sauces[] sauce;
    private int calories;
    private boolean longSize = true; // 디폴트 30cm
    private boolean baked = true; //디폴트 구움
    private String str = "chiken";
    private Menu menu;

    public ProductRepository(Menu menu) {
        this.menu =menu;
    }

    public void makeSandwich() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        switch (input) {
            case 1:
                mainIngredient = "chiken";
                break;
            case 2:
                mainIngredient = "eggmayo";
                break;
            case 3:
                mainIngredient = "BMT";
                break;
            case 4:
                mainIngredient = "vege";
                break;
            default:
                System.out.println("잘못된 입력입니다. 1~4 메뉴 중 선택하여주세요.");
                makeSandwich();
                break;
        }
        //빵 선택 빵메뉴
        menu.choiceBread();

        //길이선택
        input = scanner.nextInt();
        if(input ==1) longSize = false; //15cm
        else longSize = true; // 30cm

        //굽기선택
        input = scanner.nextInt();
        if(input ==2) baked = false; //안구움
        else baked = true; //구움

        //빵 종류선택
        input = scanner.nextInt();
        if(input ==1) {
            bread = new HoneyOat("honeyOat",110,longSize,baked);
        }else if(input ==2){
            bread = new WheatBread("wheatBread", 95,longSize,baked);
        } else if (input == 3) {
            bread = new WhiteBread("whiteBread", 100, longSize, baked);
        }else {
            System.out.println("잘못된 번호 입니다. 기본 빵(HoneyOat)이 선택됩니다.");
            bread = new HoneyOat("honeyOat",110,longSize,baked);
        }

        //치즈 선택 치즈메뉴
        menu.choiceCheese();
        //치즈 1차 선택
        input = scanner.nextInt();
        if(input ==3){
            System.out.println("치즈를 제외 합니다.");
            System.out.println("-".repeat(60));
        }
        else if(input ==1){
            cheeses = new AmericanCheese("americanCheese", 10);
            menu.addCheese();
            input = scanner.nextInt(); //치즈 추가 선택
            if (input == 1) {
                cheeses = new AmericanCheese("americanCheese", 20);
            } else if (input == 2) {
                cheeses = new Cheese("americanCheese", "mozzarellaCheese", 26);
            }else {
                System.out.println("치즈를 추가하지 않습니다. americanCheese 1개 선택하셨습니다.");
            }
        }
        else if (input ==2) {
            cheeses = new MozzarellaCheese("mozzarellaCheese", 13);
            menu.addCheese();
            input = scanner.nextInt(); // 치즈 추가 선택
            if (input == 2) {
                cheeses = new MozzarellaCheese("mozzarellaCheese", 26);
            }else if (input ==1){
                cheeses = new Cheese("mozzlellaCheese", "americanCheese", 26);
            }else {
                System.out.println("치즈를 추가하지 않습니다. mozzarellaCheese 1개 선택하셨습니다.");
            }
        }else {
            System.out.println("치즈를 제외 합니다.");
            cheeses = null;
            System.out.println("-".repeat(60));
        }

        menu.removeVege();
        input = scanner.nextInt();






    }
}
