import java.util.Scanner;

public class HappyDividing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int happyNumbers[] = {4, 7, 44, 47, 74, 77, 447, 474, 477, 744, 747, 774, 777};

        int n = scanner.nextInt();

        for (int x: happyNumbers) {
            if (n % x == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
