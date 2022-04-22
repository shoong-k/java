public class Ex7_7 {
    public static void main(String[] args) {
        Car3 car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;           //자손의 참조변수를 조상타입으로 형변환
//      car.water();
        fe2 = (FireEngine)car;  //조상의 참조변수를 자손타입으로 형변환
        fe2.water();
    }
}

class Car3 {
    String color;
    int door;

    void drive() {          //운전하는 기능
        System.out.println("drive, Brrr~");
    }

    void stop() {           //멈추는 기능
        System.out.println("stop!!");
    }
}

class FireEngine extends Car3 {
    void water() {          //물 뿌리는 기능
        System.out.println("Water!!");
    }
}