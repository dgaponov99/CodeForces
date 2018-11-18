import java.util.Scanner;

public class A_MinimizationOfLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[] string = new char[n];
        String s = scanner.next();
        for (int i = 0; i < n; i++) {
            string[i] = s.charAt(i);
        }
        char[] min = new char[n-1];
        min[0] = '~';

        for (int i = 0; i < n-1; i++) {
            if (string[i] > string[i+1]){
                for (int j = 0; j < n-1; j++) {
                    if (j < i){
                        min[j] = string[j];
                    } else {
                        min[j] = string[j + 1];
                    }
                }
                break;
            }
        }

        if (min[0] == '~'){
            for (int i = 0; i < n - 1; i++) {
                min[i] = string[i];
            }
        }
        System.out.println(min);
    }
}
