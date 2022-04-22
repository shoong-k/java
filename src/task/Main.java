package task;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Item item = new Item("양배추", 3);

        cart.SetItemData("가지", 5);
        item.SetData(7);
    }
}
