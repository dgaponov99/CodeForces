import java.util.Scanner;

public class VasyaAndIsolatedVertices {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n, m;
        long nIsolatedMin, nIsolatedMax;

        n = scanner.nextLong();
        m = scanner.nextLong();

        if (m == 0) {
            System.out.println(n + " " + n);
            System.exit(0);
        }

        long temp = n - 2 * m;
        nIsolatedMin = temp < 0 ? 0 : temp;

        temp = (long) Math.ceil(0.5 * (1 + Math.sqrt(1 + 8 * m)));
        nIsolatedMax = n - temp;

        System.out.println(nIsolatedMin + " " + nIsolatedMax);
    }
}
