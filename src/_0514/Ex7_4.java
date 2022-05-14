package _0514;

public class Ex7_4 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
        p.printPoint();
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void printPoint() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void printPoint() {
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }

}
