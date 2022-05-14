package _0507;

class Car2 {
    String color;
    String gearType;
    int door;

    Car2(){
        this("white", "auto",5);
    }

    Car2(String color) {
        this(color, "auto",5);
    }

    Car2(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    void printCar() {
        System.out.println(this.color + " , " + this.gearType + " , " + this.door);
    }
}

public class Ex6_13 {
    public static void main(String[] args) {
        Car2[] cars = new Car2[3];
        cars[0] = new Car2();
        cars[1] = new Car2("blue");
        cars[2] = new Car2("Black", "Auto", 3);

        for (int i = 0; i < cars.length; i++) {
            cars[i].printCar();
        }
    }
}
