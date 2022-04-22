class Data_1 {                          //매개변수(parameter) 없는 생성자
    int value;
        }

class Data_2 {
    int value;

    Data_2(int x) {                     //매개변수(parameter) 있는 생성자
        value = x;
        }

    Data_2(){}                         // 이거 추가 하면 에러 안남, main 클래스에서 data_2를 생성자 없이 호출했기 때문에 가능하도록 해줘야 함.
}

public class Ex6_11 {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2();
    }
}
