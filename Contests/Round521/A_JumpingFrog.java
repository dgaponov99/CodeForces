import java.util.Scanner;

public class A_JumpingFrog {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long k = scanner.nextLong();

            long step = a-b;
            long position = (k/2) * step;
            if (k % 2 == 1) {
                position += a;
            }
            System.out.println(position);
        }
    }
}
