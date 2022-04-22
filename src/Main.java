public class Main {
    public static void main(String[] args) {
        Coffee[] coffees = new Coffee[3];

        coffees[0] = new Coffee(1);
        coffees[1] = new Coffee(2);
        coffees[2] = new Coffee(3);

        for(int i=0;i< coffees.length;i++){
            coffees[i].makeCoffee();
        }

    }

    static void printHelloWorld1(){
        System.out.println("Hello World");
        System.out.println("Hello 승아");
    }

    static void printHelloWorld2(){
        System.out.println("Hello World");
        System.out.println("Hello 경수");
    }

    static void printHelloWorld(){
        printHelloWorld1();
        printHelloWorld2();
    }

    static void printNumber(int number){
        System.out.println(number);
        return;
    }

    static int plus(int left, int right){
        int sum = left + right;
        return sum;
    }
}
