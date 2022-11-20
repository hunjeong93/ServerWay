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

    public void choiceBread() {
        System.out.println("☑ 빵을 선택해주세요 __ 🥖");
        System.out.println("길이 :[1. 15cm] [2. 30cm]");
        System.out.println("굽기 :[1. 굽기] [2. 굽기선택안함]");
        System.out.println("종류 :[1. 화이트] [2. 위트] [3. 허니오트] ");
        System.out.println("-".repeat(60));
    }

    public void choiceCheese() {
        System.out.println("☑ 치즈를 선택해주세요 __ 🧀");
        System.out.println("종류 :\n" +
                "[1. 아메리칸] [2. 모차렐라] [3. 치즈 제외]\n");

    }
    public void addCheese(){
        System.out.println("치즈를 추가하시겠습니까? : \n" +
                "[1. 아메리칸] [2. 모차렐라] [3. 추가안함]\n");
        System.out.println("-".repeat(60));
    }
    public void removeVege() {
        System.out.println("☑ 제외할 야채를 선택해주세요 __ 🥬 (최대 6개)(1개씩 입력 :) \n");
        System.out.println("종류 :  \n" +
                "[1. 제외할 야채 없음] [2. 양상추] [3. 토마토]\n" +
                "[4. 오이] [5. 피클] [6. 올리브] [7. 할라피뇨]\n" +
                "\n" +
                "\n" +
                "[0. 선택완료] ");
        System.out.println("-".repeat(60));
    }

    public void choiceSauce() {
        System.out.println("☑️ 소스를 선택해주세요 __🥫 (최대 3개)");
        System.out.println("종류 :  \n" +
                "[1. 머스타드] [2. 스위트 어니언] [3. 스모크 바베큐] \n" +
                "[4. 렌치] [5. 올리브오일] [6. 선택안함]\n" +
                "\n" +
                "\n" +
                "[0. 선택완료] \n");
        System.out.println("-".repeat(60));

    }
    public void addIngredient(){
        System.out.println("☑ 추가할 재료를 선택해주세요 __🥑 (최대 5개)\n");
        System.out.println("종류 :  \n" +
                "[1. 에그마요] [2. 페퍼로니] [3. 베이컨] \n" +
                "[4. 아보카도] [5. 오믈렛] [6. 선택 안함]\n" +
                "\n" +
                "\n" +
                "[0.선택 완료] \n");
        System.out.println("-".repeat(60));
    }

    public void choiceSide() {
        System.out.println("[📣] 사이드 주문하기 __ 🍪🍟🥤");
        System.out.println("☑ 사이드를 선택해주세요 : \n");
        System.out.println("[1. 쿠키] [2. 칩] [3. 웨지 또는 스프] [4. 음료]\n");
        System.out.println("-".repeat(60));
    }
    public void choiceCookie() {
        System.out.println("☑ 쿠키를 선택해주세요 : \n");
        System.out.println("[1. 라즈베리치즈쿠키] [2. 더블초코칩쿠키] [3. 초코칩쿠키] \n");
        System.out.println("-".repeat(60));
    }
    public void choiceChip() {
        System.out.println("☑ 칩을 선택해주세요 : \n");
        System.out.println("[1. 포카칩] [2. 포테이토칩] [3. 스윙칩] \n");
        System.out.println("-".repeat(60));

    }

    public void choiceSoup() {
        System.out.println("☑ 웨지 또는 스프를 선택해주세요 : \n");
        System.out.println("[1. 웨지포테이토] [2. 해쉬브라운]\n" +
                "[3. 브로콜리체다스프] [4.양송이스프]\n");
        System.out.println("-".repeat(60));

    }

    public void choiceDrink() {
        System.out.println("☑ 음료를 선택해주세요 : \n");
        System.out.println("[1. 콜라] [2. 제로콜라] [3. 사이다] [4.아메리카노]\n");
        System.out.println("-".repeat(60));

    }

    public void choiceSet() {
        System.out.println("[📣] 세트 주문하기 __ 🥪🍪🥤\n");
    }
    public void choiceCombo() {
        System.out.println("[📣] 콤보 주문하기 __ 🥪🥤\n");
    }
}
