package task;

public class Item {
    String product = "sample";
    int count = 1;

    Item() {
        System.out.println("[Item] 기본 생성자가 호출되었습니다. 현재 상품은 '" + this.product + "' 이고, 현재 상품수는 '" + this.count + "' 입니다.");
    };

    Item(String product, int count) {
        this.product = product ;
        this.count = count;

        System.out.println("[Item] 파라미터가 있는 생성자가 호출되었습니다. 현재 상품은 '" + this.product + "' 이고, 현재 상품수는 '" + this.count + "' 입니다.");
    }

    void SetData(String product, int count) {
        this.product = product;
        this.count = count;

        System.out.println("[Item] 상품이 '" + this.product + "' 로, 상품수는 '" + this.count + "' 로 변경되었습니다.");
    }

    void SetData(int count) {
        this.count = count;

        System.out.println("[Item] 상품수가 '" + this.count + "' 로 변경되었습니다.");
    }
}
