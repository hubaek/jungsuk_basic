package ch7;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
    Product2(){}
}
class Tv2 extends Product2 {
    Tv2(){
        super(100);
    }
    public String toString(){ return "Tv"; }

}
class Computer2 extends Product2 {
    Computer2(){
        super(200);
    }
    public String toString(){ return "Computer"; }
}
class Audio2 extends Product2 {
    Audio2(){
        super(50);
    }
    public String toString(){ return "Audio"; }
}
class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];   // 구입한 제품을 저장하기 위한 배열
    int i = 0;  // Product 배열 cart에 사용될 index

    void buy(Product2 p){
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;  // 제품을 Product[] cart에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다."); // p.toSting()+문자열
    }
    void summary() {            // 구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;            // 구입한 물품의 가격합계
        String itemList ="";    // 구입한 물품목록

        // 반복물을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < cart.length; i++) {
            if (cart[i]==null) break;
            sum += cart[i].price;
            itemList += cart[i]+",";
        }
        System.out.println("구입한 물품의 총 금액 : " + sum);
        System.out.println("구입하신 제품은 : " + itemList);
    }
}

public class Ex7_9 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
        System.out.println("현재 남은 돈은 : "+b.money);
        System.out.println("현재 보너스점수는 : "+b.bonusPoint);

    }
}
