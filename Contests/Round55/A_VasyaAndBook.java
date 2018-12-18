import java.util.Scanner;

public class A_VasyaAndBook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            long
                    n = scanner.nextLong(),
                    x = scanner.nextLong(),
                    y = scanner.nextLong(),
                    d = scanner.nextLong();

            if ((y - x) % d == 0) {
                System.out.println(((long) Math.abs(x - y)) / d);
                continue;
            }

            if ((y - 1) % d == 0 && (n - y) % d == 0) {
                long leftStep = (y - 1) / d;
                long fromLeft = (long) Math.ceil(1.0 * (x - 1) / d);
                long rightStep = (n - y) / d;
                long fromRight = (long) Math.ceil(1.0 * (n - x) / d);
                System.out.println(Math.min(leftStep + fromLeft, rightStep + fromRight));
                continue;
            }

            if ((y - 1) % d == 0) {
                long leftStep = (y - 1) / d;
                long fromLeft = (long) Math.ceil(1.0 * (x - 1) / d);
                System.out.println(leftStep + fromLeft);
                continue;
            }

            if ((n - y) % d == 0) {
                long rightStep = (n - y) / d;
                long fromRight = (long) Math.ceil(1.0 * (n - x) / d);
                System.out.println(rightStep + fromRight);
                continue;
            }
            System.out.println(-1);
        }
    }
}
