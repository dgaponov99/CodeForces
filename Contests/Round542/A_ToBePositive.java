import java.util.Scanner;

public class A_ToBePositive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pCount = 0;
        int nCount = 0;
        int zCount = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (a > 0) {
                pCount++;
            } else if (a < 0) {
                nCount++;
            } else {
                zCount++;
            }
        }
        int middle = (int) Math.ceil(n / 2.0);
        if (pCount >= middle) {
            System.out.println(4);
        } else if (nCount >= middle) {
            System.out.println(-4);
        } else {
            System.out.println(0);
        }
    }
}
