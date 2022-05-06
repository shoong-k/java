package _0507;

class Data3{int x;}

public class Ex6_8 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d);   //d2.x는 0인 상황에서 d의 주소를 copy 메서드에 넣음, d2.x=10
        System.out.println("d.x = "+ d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data3 copy(Data3 d) {    //tmp 인스턴스 생성해서 리턴해줌, tmp.x는 파라미터로 받은 인스턴스의 x값
        Data3 tmp = new Data3();
        tmp.x = d.x;
        return tmp;
    }
}
