import java.util.Scanner;

public class C_GoodArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long sum = 0;
        long max1 = 0;
        int max1_p = -1;
        long max2 = 0;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            long a = scanner.nextLong();
            arr[i] = a;
            sum += a;
            if (a > max1) {
                max2 = max1;
                max1 = a;
                max1_p = i;
            }
            if (a > max2 && a < max1) {
                max2 = a;
            }
        }


        int k = 0;
        StringBuilder beautyNumber = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i != max1_p) {
                if (sum - arr[i] - max1 == max1) {
                    k++;
                    beautyNumber.append(i + 1).append(" ");
                }
            } else {
                if (sum - arr[i] - max2 == max2) {
                    k++;
                    beautyNumber.append(i + 1).append(" ");
                }
            }
        }
        System.out.println(k);
        System.out.println(beautyNumber);

    }
}
