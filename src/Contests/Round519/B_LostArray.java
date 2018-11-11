package Contests.Round519;

import java.util.ArrayList;
import java.util.Scanner;

public class B_LostArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] aArray = new int[n];
        int prevA = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            aArray[i] = a - prevA;
            prevA = a;
        }

        ArrayList<Integer> periods = new ArrayList<>();
        for (int k = 1; k < n + 1; k++) {
            for (int i = 0; i < n; i++) {
                if (aArray[i] != aArray[i % k]) {
                    periods.add(k);
                    break;
                }
            }
        }

        System.out.println(n - periods.size());
        for (int i = 1, j = 0; i < n + 1; i++) {
            if (j < periods.size() && periods.get(j) == i) {
                j++;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}