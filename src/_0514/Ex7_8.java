package _0514;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super (200);
    }

    public String toString() {
        return "Computer";
    }

}

class Buyer {
    int money;
    int bonusPoint;
    int cartNum;
    Product[] cart = new Product[10];

    Buyer(int money) {
        this.money = money;
        bonusPoint = 0;
        cartNum = 0;
    }

    void buy(Product p) {
        int minus = p.price - money;

        if (money < p.price) {
            System.out.println("돈이 부족해요. 부족한 돈은 " + minus + "만원 입니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구매하셨습니다.");
        System.out.println("현재 잔액은 " + money + "만원 입니다.");
        System.out.println("현재 포인트는 " + bonusPoint + "입니다.");

        cart[cartNum] = p;
        cartNum ++;
    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer(1000);

        b.buy(new Tv1());
        b.buy(new Computer());
        b.buy(new Computer());
//        b.buy(new Computer());
//        b.buy(new Computer());
//        b.buy(new Computer());
    }
}
