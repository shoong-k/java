public class Ex3_14 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" ==\"abc\"? %b%n", "abc"=="abc");
        System.out.printf(" str1 ==\"abc\"? %b%n", str1=="abc");
        System.out.printf(" str2 ==\"abc\"? %b%n", str2=="abc");

        System.out.printf(" str1.equals(\"abc\")? %b%n", str1.equals("abc"));
        System.out.printf(" str2.equals(\"abc\")? %b%n", str2.equals("abc"));
        System.out.printf(" str2.equals(\"abc\")? %b%n", str2.equals("ABC"));
        System.out.printf(" str2.equalsIgnoreCase(\"abc\")? %b%n", str2.equalsIgnoreCase("ABC"));

        System.out.println("예제는 아니고 그냥 단순하게 내가 해본거. 위 예제 너무 복잡함");
        String str = "abc";

        System.out.println(str.equals("ABC"));
        System.out.println(str.equalsIgnoreCase("ABC"));

    }
}
