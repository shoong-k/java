public class Coffee {
    int type = 1;
    int temp = 70;

    //생성자
    public Coffee() {
        System.out.println("커피가 만들어졌습니다.");
    }

    public Coffee(int type){
        System.out.println("type 커피가 만들어졌습니다.");
        this.type = type;
    }

    public Coffee(int type, int temp){
        this.type = type;
        this.temp = temp;
        //setData(type, temp);
    }

    //메서드
    void setData(int type, int temp) {
        this.type = type;
        this.temp = temp;
    }

    void printCoffee() {
        System.out.println(this.type);
        System.out.println(this.temp);
    }

    void makeCoffee() {
        if (this.type == 1){
            System.out.println("아메리카노를 만들었습니다.");
        } else if (this.type == 2){
            System.out.println("라떼를 만들었습니다.");
        } else {
            System.out.println("콜드브루를 만들었습니다.");
        }
    }
}
