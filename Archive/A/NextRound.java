import java.util.Scanner;

public class NextRound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        short k = scanner.nextShort();

        short a;
        short count = 0;
        short ak = 0;
        for (int i = 0; i < n; i++) {
            a = scanner.nextShort();
            if (i < k - 1 && a > 0) count++;
            if (i == k - 1 && a > 0){
                ak = a;
                count++;
            }
            if (a == ak && i > k - 1 && a > 0) count++;
        }
        System.out.println(count);
    }
}
