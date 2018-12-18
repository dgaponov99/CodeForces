import java.util.Arrays;
import java.util.Scanner;

public class B_Exhibit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Оно работает, он ему не нрав что памяти не хватает...
        /*int max = 0;
        long sum = 0;

        int[] rightCamera = new int[m];
        for (int i = 0; i < m; i++) {
            rightCamera[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            rightCamera[a-1]++;
            sum += a;
            if (a > max){
                max = a;
            }
        }
        int stock = 0;
        int extra = 0;
        for (int i = max - 1; i >= 0 ; i--) {
            int a = rightCamera[i];
            if (a > 1){
                stock += a - 1;
            }
            if (a == 0) {
                if (stock > 0){
                    stock--;
                } else {
                    extra++;
                }
            }
        }
        System.out.println(sum - (n + extra));*/

        int[] arr = new int[n];
        long sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            arr[i] = a;
            sum += a;
            if (a > max){
                max = a;
            }
        }
        //Arrays.sort(arr);
        /*long count = 0;
        int blockStart_i = 1;
        int blockLength = 0;
        int blockEl = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i-1]){
                blockLength++;
                blockEl = arr[i];
            } else {
                if (blockStart_i > 0) {
                    blockEl -= arr[blockStart_i - 1];
                }



                blockLength = 0;
                blockStart_i = i;
            }
        }
        System.out.println(count);*/
        System.out.println(max < n ? sum - n : sum - max);
    }
}
