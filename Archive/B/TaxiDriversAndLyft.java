import java.util.Scanner;

public class TaxiDriversAndLyft {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (m == 1) {
            System.out.println(n);
            return;
        }

        long[] contact = new long[n + m];
        for (int i = 0; i < n + m; i++) {
            contact[i] = scanner.nextLong();
        }
        int[] taxiDriver = new int[m];
        int[] passengerCount = new int[m];
        for (int i = 0; i < m; i++) {
            passengerCount[i] = 0;
        }
        for (int i = 0, j = 0; i < n + m; i++) {
            if (scanner.nextInt() == 1) {
                taxiDriver[j] = i;
                j++;
            }
        }

        passengerCount[0] = taxiDriver[0];
        passengerCount[m - 1] = n + m - taxiDriver[m - 1] - 1;
        for (int i = 0; i < m - 1; i++) {
            int t1 = taxiDriver[i];
            int t2 = taxiDriver[i + 1];

            for (int j = t1 + 1; j < t2; j++) {
                if (contact[j] - contact[t1] <= contact[t2] - contact[j]) {
                    passengerCount[i]++;
                }
                if (contact[j] - contact[t1] > contact[t2] - contact[j]) {
                    passengerCount[i + 1]++;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            System.out.print(passengerCount[i] + " ");
        }
    }
}
