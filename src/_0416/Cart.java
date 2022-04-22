package _0416;

public class Cart {
    Item a = new Item(1,1);
    Item b = new Item(2,1);

    void setAItemData(int type, int count){
        this.a.setData(type, count);
    }

    void setItemData(int itemIndex, int a, int b) {
        if (itemIndex == 1) {
            this.a.type = a;
            this.a.count = b;
        } else if (itemIndex == 2) {
            this.b.type = a;
            this.b.count = b;
        }
    }
}
