import java.util.Scanner;

public class B_VovaAndCups {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] cups = new int[2][n];
        for (int i = 0; i < n; i++) {
            cups[0][i] = -1;
            cups[1][i] = 0;
        }
        String strCups = scanner.next();
        int j = 0;
        for (int i = 0; i < n; i++) {
            int a = strCups.charAt(i) == 'G' ? 1 : 0;
            if (i == 0) {
                cups[0][j] = a;
                cups[1][j]++;
                continue;
            }

            if (a == cups[0][j]) {
                cups[1][j]++;
            } else {
                j++;
                cups[0][j] = a;
                cups[1][j]++;
            }
        }

        int max = 0;
        boolean stock = false;
        for (int i = 0; i < j + 1; i++) {
            if (cups[0][i] == 1) {
                if (cups[1][i] > max) {
                    max = cups[1][i];
                } else
                    stock = true;
            }
        }
        if (stock) {
            max++;
        }

        int maxWithSpace = 0;
        stock = false;
        for (int i = 0; i < j - 1; i++) {
            if (cups[0][i] == 1) {
                if (cups[1][i+1] == 1){
                    if (cups[1][i] + cups[1][i+2] > maxWithSpace){
                        maxWithSpace = cups[1][i] + cups[1][i+2];
                    } else {
                        stock = true;
                    }
                } else
                    stock = true;
            }
        }
        if (stock){
            maxWithSpace++;
        }
        System.out.println(Math.max(max, maxWithSpace));
    }
}
