package task;

public class Cart {
    Item item1 = new Item();
    Item item2 = new Item("trevi", 2);

    Cart() {
        System.out.println("[Cart] 기본생성자가 호출되었습니다.");
    }

    void SetItemData(String product, int count) {
        System.out.println("[Cart] 파라미터 있는 메서드가 호출되었고, 이 메서드는 [Item]의 파라미터 있는 메서드를 호출합니다.");
        this.item1.SetData(product, count);
    }
}
