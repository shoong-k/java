package _0507;

public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        mm.printResult(mm.add(5L, 3L));

        System.out.println(mm.subtract(5L, 3L));

        long result3 = mm.multiply(5L, 3L);
        System.out.println(result3);

        double result4 = mm.divide(5L, 3L);

    }
}

class MyMath {

    long add(long a, long b) {
        long result = a + b;
        return result;
    }

    long subtract(long a, long b) {return a - b;}
    long multiply(long a, long b) {return a * b;}
    double divide(long a, long b) {return a / b;}

    void printResult(long result){
        System.out.println(result);
    }
}
