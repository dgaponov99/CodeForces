import java.util.Scanner;

public class A_NastyaIsReadingABook {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] chapters = new int[n];
        for (int i = 0; i < n; i++) {
            scanner.nextInt();
            chapters[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (k <= chapters[i]) {
                System.out.println(n - i);
                return;
            }
        }
    }
}
