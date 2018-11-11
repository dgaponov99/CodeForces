package Archive.A;

import java.util.Scanner;

public class HaveTimeAll {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();

        long sum = a + b;

        long countOfBook = (long) (0.5 * (-1 + Math.sqrt(1 + 8 * sum)));


        StringBuilder firstDay = new StringBuilder();
        StringBuilder secondDay = new StringBuilder();

        long firstCount = 0;
        long secondCount = 0;

        for (long i = countOfBook; i > 0; i--) {
            if (i <= a) {
                a -= i;
                firstDay.append(i).append(" ");
                firstCount++;
            } else {
                secondDay.append(i).append(" ");
                secondCount++;
            }
        }

        System.out.println(firstCount);
        System.out.println(firstDay);
        System.out.println(secondCount);
        System.out.println(secondDay);
    }
}
