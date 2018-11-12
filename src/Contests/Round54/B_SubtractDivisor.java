package Contests.Round54;

import java.util.Scanner;

/**
 * Доделал сразу после окончания
 */

public class B_SubtractDivisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long count = 0;


        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i > 2) {
                    count++;
                    n -= i;
                }
                count += n / 2;
                break;
            }
        }
        if (count == 0){
            count = 1;
        }

        System.out.println(count);
    }
}
