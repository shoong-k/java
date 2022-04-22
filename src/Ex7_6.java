import static java.lang.System.out;         //System.out을 out만으로 참조 가능. 클래스명(System) 생략
import static java.lang.Math.*;             //Math 클래스의 멤버를 참조할 때 클래스명(Math) 생략 가능

public class Ex7_6 {
    public static void main(String[] args) {
        out.println(random());              //System, Math 생략
        out.println("Math.PI : " + PI);
    }
}
