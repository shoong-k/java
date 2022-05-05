package _0507;

public class Ex6_3 {
    public static void main(String[] args) {

        Card[] cards = new Card[2];
        cards[0] = new Card("Heart", 7);
        cards[1] = new Card("Spade", 4);

        for (int i = 0; i<cards.length; i++) {
            cards[i].printCard();
        }
    }
}

class Card {
    String kind;
    int number;
    int width = 100;
    int height = 250;

    Card() {}

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    void printCard() {
        System.out.println(this.kind + " , " + this.number + " , " + this.width + " , " + this.height);
    }
}
