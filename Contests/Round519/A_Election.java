import java.util.Scanner;

public class A_Election {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxA = 0;
        int sumA = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a > maxA) maxA = a;
            sumA += a;
        }

        int k = (2*sumA)/n + 1;
        System.out.println(k < maxA ? maxA : k);
    }
}
