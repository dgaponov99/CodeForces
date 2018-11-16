package Contests.Round521;

import java.util.Scanner;

public class B_ConcernedTenants {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int house[] = new int[n];
        for (int i = 0; i < n; i++) {
            house[i] = scanner.nextInt();
        }

        int k = 0;
        for (int i = 1; i < n - 1; i++) {
            if (house[i] == 0 && house[i - 1] == 1 && house[i + 1] == 1){
                k++;
                house[i+1] = 0;
            }
        }
        System.out.println(k);
    }
}
