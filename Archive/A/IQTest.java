import java.util.Scanner;

public class IQTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int countEven = 0;
        int firstEven = 0;
        int firstUneven = 0;

        for (int i = 1; i <= n; i++) {
            int a = scanner.nextInt();
            if (a % 2 == 0) {
                countEven++;
                firstEven = i;
            } else {
                firstUneven = i;
            }
        }

        System.out.println(countEven == 1 ? firstEven : firstUneven);
    }
}
