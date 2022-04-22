package _0416;

public class Main {
    public static void main(String[] args) {
       Cart cart = new Cart();
       cart.a.type = 3;
       cart.b.count = 4;
       cart.b.setData(7,8);

       cart.setAItemData(9,10);
       cart.setItemData(1,12, 13);
    }
}
