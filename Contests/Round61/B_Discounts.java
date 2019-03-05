import java.util.Arrays;
import java.util.Scanner;

//CF считает что java медленная... на Python все работает

public class B_Discounts {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int q = scanner.nextInt();
            System.out.println(sum - a[n - q]);
        }
    }
}
