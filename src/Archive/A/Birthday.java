package Archive.A;

import java.util.Scanner;

// Исправьте компилятор на CF

public class Birthday {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        long K = scanner.nextLong();
        long L = scanner.nextLong();

        double toDouble = 1.0;

        long x = (long) Math.ceil(toDouble * (L + K) / M);
        double temp = toDouble * N / M;
        if (x <= temp) {
            System.out.println(x);
        } else {
            System.out.println(-1);
        }
    }
}
