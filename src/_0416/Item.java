package _0416;

public class Item {
    int type = 1;
    int count = 1;

    Item(){
        System.out.println("아이템이 만들어졌습니다.");
    };

    Item(int a) {
        System.out.println(a + " 아이템이 만들어졌습니다." + this.type);
    }

    Item(int a, int b) {
        this.type = a;
        this.count = b;
        System.out.println(this.type + "," + this.count);
    }

    void setData(int a, int b) {
        this.type = a;
        this.count = b;
        System.out.println(this.type + "," + this.count);
    }

    void printType(int a) {
        System.out.println(a + this.type);
    }

    void print(int x) {
        System.out.println(x);
    }
}
