import java.util.Scanner;

public class B_NewYearAndTheLocationOfTheTreasure {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] x_obelisks = new long[n];
        long[] y_obelisks = new long[n];
        long[] x_tips = new long[n];
        long[] y_tips = new long[n];
        for (int i = 0; i < n; i++) {
            x_obelisks[i] = scanner.nextInt();
            y_obelisks[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            x_tips[i] = scanner.nextInt();
            y_tips[i] = scanner.nextInt();
        }

        if (n == 1) {
            System.out.println((x_obelisks[0] + x_tips[0]) + " " + (y_obelisks[0] + y_tips[0]));
            return;
        }

        if (n == 2) {
            for (int i = 0; i < n; i++) {
                long x_point = x_obelisks[0] + x_tips[i];
                long y_point = y_obelisks[0] + y_tips[i];
                for (int j = 0; j < n; j++) {
                    if (x_point == x_obelisks[1] + x_tips[j] && y_point == y_obelisks[1] + y_tips[j]) {
                        System.out.println(x_point + " " + y_point);
                        return;
                    }
                }
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            long x_point1 = x_obelisks[0] + x_tips[i];
            long y_point1 = y_obelisks[0] + y_tips[i];
            for (int j = 0; j < n; j++) {
                long x_point2 = x_obelisks[1] + x_tips[j];
                long y_point2 = y_obelisks[1] + y_tips[j];
                if (x_point1 == x_point2 && y_point1 == y_point2) {
                    for (int k = 0; k < n; k++) {
                        if (x_point1 == x_obelisks[2] + x_tips[k] && y_point1 == y_obelisks[2] + y_tips[k]) {
                            System.out.println(x_point1 + " " + y_point1);
                        }
                    }
                }
            }
        }

    }
}
