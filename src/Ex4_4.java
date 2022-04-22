import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.print("점수를 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();

        if (score <0 || score > 100 ) {
            System.out.println("0에서 100까지의 숫자를 입력하세요.");
        } else if (score >=90) {
            grade = 'A';
            System.out.println("당신의 학점은 "+ grade +"입니다.");
        } else if (score >= 80) {
            grade = 'B';
            System.out.println("당신의 학점은 "+ grade +"입니다.");
        } else if (score >= 70) {
            grade = 'C';
            System.out.println("당신의 학점은 "+ grade +"입니다.");
        } else {
            grade = 'D';
            System.out.println("당신의 학점은 " + grade + "입니다.");
        }
    }
}
