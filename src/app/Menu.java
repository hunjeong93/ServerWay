package app;

import app.product.Product;

public class Menu {

    public void printEntrance() {
        System.out.println("☑ 이용하실 서비스를 선택해주세요 :");
        System.out.println("\n[1. 제품선택]");
        System.out.println("[2. 장바구니]\n");
        System.out.println("-".repeat(60));

    }

    public void choiceMenu() {
        System.out.println("[📣] 제품 선택하기 ");
        System.out.println("☑ 주문할 제품을 선택해주세요 :");
        System.out.println("-".repeat(60));
        System.out.println("\n[1. 샌드위치 단품 주문하기]" );
        System.out.println("[2. 사이드 단품 주문하기]" );
        System.out.println("[3. 세트 주문하기]" );
        System.out.println("[4. 콤보 주문하기]" );
        System.out.println("[5. 돌아가기]\n" );
        System.out.println("-".repeat(60));



    }

    public void choiceSandwich() {
        System.out.println("[📣] 샌드위치 주문하기 __ 🥪");
        System.out.println("☑ 샌드위치 제품을 선택해주세요 :");
        System.out.println("-".repeat(60));
        System.out.println("\n[1. 🍗 로스트 치킨 샌드위치]" );
        System.out.println("[2. 🥚 에그마요 샌드위치]");
        System.out.println("[3. 🥓 이탈리안 BMT 샌드위치]" );
        System.out.println("[4. 🥬 베지테리안 전용 샌드위치]\n" );
        System.out.println("-".repeat(60));

    }
}
