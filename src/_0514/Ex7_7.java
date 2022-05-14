package _0514;

public class Ex7_7 {
    public static void main(String[] args) {
        Car car;
        // Car car = null; 예제는 이렇게 코딩했음
        FireEngine fe = new FireEngine();
        FireEngine fe2;

        fe.water();
        car = fe;
        //car.water(); <- car타입의 참조변수로 water()를 호출 할 수 없다.
        fe2 = (FireEngine) car;
        fe2.water();
    }
}

class Car{
    String color;
    int door;

    void drive() {
        System.out.println("운전 중");
    }

    void stop() {
        System.out.println("멈춤");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("물 뿌리는 중 ~");
    }
}