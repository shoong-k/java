package _0507;

class Car {
    String color;
    String gearType;
    int door;

    Car() {}

    Car(String color, String gearType, int door) {
        Car car = new Car();
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    void printCar() {
        System.out.println(this.color + "," + this.gearType + "," + this.door);
    }
}
public class Ex6_12 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new Car("White", "auto", 2);
        cars[1] = new Car("Red", "auto", 4);
        cars[2] = new Car("Black", "auto", 3);

        for (int i=0; i< cars.length; i++){
            cars[i].printCar();
        }
    }

}
