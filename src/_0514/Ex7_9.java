package _0514;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product2(){};
}

class Tv2 extends Product2 {
    Tv2() { super(100);}

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {super(200);}

    @Override
    public String toString() {
        return "computer";
    }
}

class Audio2 extends Product2 {
    Audio2() {super(50);}

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer2 {
    int money;
    int bonusPoint;
    Product2[] cart = new Product2[10];
    int cartNum;

    Buyer2(int money) {
        this.money = money;
        bonusPoint = 0;
        cartNum = 0;
    }

    void buy(Product2 p) {
        if(money < p.price) {
            System.out.println("돈이 없어요. 카드를 주세요.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[cartNum++] = p;
        System.out.println(p + "를 구입하셨습니다.");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i = 0; i<cart.length; i++) {
            if(cart[i] == null) break;
            sum += cart[i].price;
            itemList += cart[i] + ",";
        }

        System.out.println("구입하신 제품의 총 금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}

public class Ex7_9 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2(1000);

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}
