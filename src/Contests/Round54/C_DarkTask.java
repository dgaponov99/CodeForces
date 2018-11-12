package Contests.Round54;


import java.util.Scanner;

/**
 * Сделал сразу после окончания
 */

public class C_DarkTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int d;
        for (int i = 0; i < t; i++) {
            d = scanner.nextInt();
            double discriminant = Math.pow(d, 2) - 4 * d;
            if (discriminant < 0) {
                System.out.println("N");
                continue;
            }
            double a = 0.5 * (d + Math.sqrt(discriminant));

            if (d - a >= 0)
                System.out.format("Y %.9f %.9f\n", a, d - a);
            else
                System.out.println("N");

        }
    }
}
