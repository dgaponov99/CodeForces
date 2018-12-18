import java.util.Scanner;

public class A_Coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long S = scanner.nextLong();
        long coinsCount = S/n;
        if (S % n != 0)
            coinsCount++;
        System.out.println(coinsCount);
    }
}
