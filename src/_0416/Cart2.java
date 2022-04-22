package _0416;

public class Cart2 {
    Item[] items = new Item[3];

    Cart2(){
        for (int i=0; i<3; i++) {
            this.items[i] = new Item();
        }
    }

    void setItemData(int index, int type, int count) {
//        this.items[index].type = type;
//        this.items[index].count = count;

        Item item = this.items[index];
        item.type = type;
        item.count = count;
    }
}
