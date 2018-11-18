import java.util.*;

public class BerlandFair {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long T = scanner.nextLong();
        long[] sweetCoast = new long[n];
        long[] sortedSweetCoast = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            sweetCoast[i] = a;
            sortedSweetCoast[i] = a;
            sum += a;
        }

        Arrays.sort(sortedSweetCoast);

        long min = sortedSweetCoast[0];
        long max = sortedSweetCoast[n-1];
        int max_i = n - 1;
        int countKiosk = n;

        long countSweet = 0;

        while (T >= min) {
            if (T >= sum) {
                countSweet += (T / sum) * countKiosk;
                T %= sum;
            } else if (T >= max) {
                for (int i = 0; i < n; i++) {
                    if (sweetCoast[i] <= T){
                        T -= sweetCoast[i];
                        countSweet++;
                    }
                }
            } else {
                sum -= max;
                max_i--;
                max = sortedSweetCoast[max_i];
                countKiosk--;
            }
        }

        System.out.println(countSweet);


    }
}
