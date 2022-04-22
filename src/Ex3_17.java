public class Ex3_17 {
    public static void main(String[] args) {
        int x, y, z;
        int absX, absY, absZ;
        char signX, signY, signZ;

        x = 10;
        y = -5;
        z = 0;

        absX = x >= 0? x : -x;    /// 음수면 양수로 변환하여 abs에 넣는다
        absY = y >= 0? y : -y;
        absZ = z >= 0? z : -z;
        signX = x > 0 ? '+': ( x == 0 ? ' ' : '-');       ///양수면 + 양수가 아니면 (0이면 ' '  음수면 -)
        signY = y > 0 ? '+': ( y == 0 ? ' ' : '-');
        signZ = z > 0 ? '+': ( z == 0 ? ' ' : '-');

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(absX);
        System.out.println(absY);
        System.out.println(absZ);
        System.out.println(signX);
        System.out.println(signY);
        System.out.println(signZ);

        System.out.printf("x=%c%d%n", signX, absX);
        System.out.printf("y=%c%d%n", signY, absY);
        System.out.printf("z=%c%d%n", signZ, absZ);

    }
}
