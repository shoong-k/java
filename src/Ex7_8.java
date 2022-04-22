class Product {
    int price;
    int bonusPoint;

    Product(int price) {                        //매개변수가 있는 생성자
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product {
    Tv1() {super(100);}                                //Tv1클래스의 생성자는, 조상클래스의 생성자 호출

    @Override
    public String toString() {return "Tv";}                 //toString()을 오버라이딩, 상속받은 메서드 내용변경
}

class Computer extends Product {
    Computer() {super(200);}

    @Override
    public String toString() {return "Computer";}
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}

public class Ex7_8 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 가지고 계신 보너스점수는 " + b.bonusPoint + "점 입니다.");

        b.buy(new Computer());
        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 가지고 계신 보너스점수는 " + b.bonusPoint + "점 입니다.");
    }
}
