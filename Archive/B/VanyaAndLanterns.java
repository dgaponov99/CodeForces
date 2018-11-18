import java.util.*;

public class VanyaAndLanterns {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long l = scanner.nextLong();
        double d = 0;


        HashMap<Integer, Integer> lanternsTest = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (lanternsTest.containsKey(a))
                continue;
            lanternsTest.put(a, null);
        }

        int[] latArr = new int[lanternsTest.keySet().size()];
        int j = 0;
        for (Integer integer :
                lanternsTest.keySet()) {
            latArr[j] = integer;
            j++;
        }
        Arrays.sort(latArr);
        int len = j;
        for (int i = 0; i < len + 1; i++) {
            if (i == 0) {
                d = latArr[0];
                continue;
            }
            if (i == len ) {
                d = (l - latArr[len-1]) > d ? l - latArr[len-1] : d;
                continue;
            }
            d = (latArr[i] - latArr[i - 1]) > 2 * d ? (latArr[i] - latArr[i - 1]) / 2.0 : d;
        }
        System.out.format(Locale.US,"%.9f%n", d);
    }
}
