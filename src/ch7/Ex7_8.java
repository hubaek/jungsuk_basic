package ch7;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
}
class Tv1 extends Product {
    Tv1(){
        super(100);
    }
    public String toString(){ return "Tv"; }

}
class Computer extends Product {
    Computer(){
        super(200);
    }
    public String toString(){ return "Computer"; }
}
class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Product[] cart = new Product[10];   // 구입한 제품을 저장하기 위한 배열
    int i = 0;  // Product 배열 cart에 사용될 index

    void buy(Product p){
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;  // 제품을 Product[] cart에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다."); // p.toSting()+문자열
    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv1());
        b.buy(new Computer());
        System.out.println("현재 남은 돈은 : "+b.money);
        System.out.println("현재 보너스점수는 : "+b.bonusPoint);
    }
}
