import java.util.Scanner;

public class B_DrawnGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long equal = 1;
        long a[] = new long[2];
        long b[] = new long[2];
        for (int i = 0; i < n; i++) {
            a[1] = scanner.nextLong();
            b[1] = scanner.nextLong();

            if (a[0] == b[0]) {
                equal--;
            }

            if (b[0] >= a[0] && b[0] <= a[1]) {
                equal += Math.min(a[1] - b[0] + 1, b[1] - b[0] + 1);
            } else if (b[1] >= a[0] && b[1] <= a[1]) {
                equal += b[1] - a[0] + 1;
            } else if (a[0] >= b[0] && a[1] <= b[1]) {
                equal += a[1] - a[0] + 1;
            }

            a[0] = a[1];
            b[0] = b[1];
        }
        System.out.println(equal);
    }
}
