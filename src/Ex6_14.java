public class Ex6_14 {
    static {
        System.out.println("Static { }");       //클래스 변수 초기화 블럭
    }

    {
        System.out.println("{ }");       //인스턴스 변수 초기화 블럭
    }

    public Ex6_14() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("Ex6_14 bt = new Ex6_14();");
        Ex6_14 bt = new Ex6_14();        //Ex6_14 클래스의 인스턴스를 생성해서 bt1 참조변수에 주소 저장

        System.out.println("Ex6_14 bt2 = new Ex6_14();");
        Ex6_14 bt2 = new Ex6_14();        //Ex6_14 클래스의 인스턴스를 생성해서 bt2 참조변수에 주소 저장
    }

}
