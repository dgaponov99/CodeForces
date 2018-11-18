import java.util.Scanner;

// Да ну вас нафиг...

public class A_Prank {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        /*if (a < 3) {
            System.out.println(0);
            return;
        }

        int count = 0;
        int firstPosition = -1;
        int lastPosition = -1;

        int k = scanner.nextInt();
        int tempCount = 0;
        for (int i = 1; i < a; i++) {
            int number = scanner.nextInt();
            if (number - 1 == k) {
                lastPosition = i;
                if (firstPosition == 0 && lastPosition == 2) {
                    tempCount++;
                }
                if (firstPosition != 0 && i == a - 1 && firstPosition < a - 2) {
                    tempCount++;
                }

                tempCount++;
                if (firstPosition == -1) {
                    firstPosition = i - 1;
                }

                if (tempCount > count) {
                    count = tempCount;
                }
            } else {
                tempCount = 0;
                firstPosition = -1;
            }
            k = number;
        }

        if (count == 0) {
            System.out.println(0);
        } else
            System.out.println(count - 1);*/

        if (a == 1) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[a];
        boolean flag = true;
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
            if (i > 0 && arr[i] > arr[i - 1] + 1) {
                flag = false;
            }
        }

        if (flag && arr[0] == 1) {
            System.out.println(a - 1);
        }

        int TotalFP;
        int TotalLP;
        int count = 0;
        int countF;
        int countL;

        for (int i = 1; i < a; i++) {

        }

    }
}
