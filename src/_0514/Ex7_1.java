package _0514;

class Tv {
    boolean power;
    int channel;

    void power() { power =! power; }
    void channelUp() { ++channel; }
    void channelDown() { --channel; }

    void printChannel() {
        System.out.println(channel);
    }
}

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }
}

public class Ex7_1 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        stv.printChannel();

        stv.displayCaption("Hello, World");
        stv.caption = true;
        stv.displayCaption("Hello, World 2");
    }
}
