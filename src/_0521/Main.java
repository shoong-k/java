package _0521;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("롯데");

        department.addStore("삼성");
        department.addProduct("삼성", "노트북");
        department.addProduct("삼성", "TV");

        department.printProduct("노트북");
        department.printProduct("핸대폰");

        department.addStore("LG");
        department.addProduct("삼성", "핸드폰");
        department.addProduct("LG", "핸드폰");

        department.printProduct("핸드폰");
    }
}
