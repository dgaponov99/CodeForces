import java.util.Scanner;

public class B_NastyaIsPlayingInTheComputer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        if (k == 1 || k == n) {
            System.out.println(n * 3);
            return;
        }

        int count = 0;
        if (k <= n / 2) {
            count += k * 3;
            count += k - 1;
            count += (n - k) * 3;
            System.out.println(count);
        } else {
            count += (n - k + 1) * 3;
            count += n - k;
            count += (k - 1) * 3;
            System.out.println(count);
        }
    }
}
