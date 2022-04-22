package pay;

public class Main {
    public static void main(String[] args) {
//        int payType = 2;
//
//        if(payType == 1) {
//            System.out.println("만나서 결제입니다.");
//        } else if(payType == 2) {
//            System.out.println("비대면 결제입니다.");
//        }
        MeetPay meetPay = new MeetPay();
        meetPay.doPay();
    }
}

