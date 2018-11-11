package Archive.B;

import java.util.Scanner;

public class QueueAtSchool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();

        String sQueue = scanner.next();
        char[] queue = new char[n];
        for (int i = 0; i < n; i++) {
            queue[i] = sQueue.charAt(i);
        }

        boolean flag;
        for (int i = 0; i < t; i++) {
            flag = false;
            for (int j = 0; j < n - 1; j++) {
                if (flag) {
                    flag = false;
                    continue;
                }
                if (queue[j] == 'B' && queue[j + 1] == 'G') {
                    queue[j] = 'G';
                    queue[j + 1] = 'B';
                    flag = true;
                }
            }
        }
        System.out.println(queue);
    }
}
