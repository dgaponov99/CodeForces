import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class B_TwoCakes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        HashMap<Long, Long[]> locationOfLayers = new HashMap<>();
        Long[] tempArr;
        Long[] tempArr2;
        for (long i = 1; i < 2 * n + 1; i++) {
            long a = scanner.nextLong();
            if (!locationOfLayers.containsKey(a)) {
                tempArr = new Long[2];
                tempArr[0] = i;
                tempArr[1] = -1L;
                locationOfLayers.put(a, tempArr);
            } else {
                tempArr2 = locationOfLayers.get(a);
                tempArr2[1] = i;
                locationOfLayers.put(a, tempArr2);
            }
        }
        int SSteps = 0;
        int DSteps = 0;
        tempArr = new Long[2];
        tempArr[0] = 1L;
        tempArr[1] = 1L;
        Long[] tempArr3;
        for (long i = 1; i < n + 1; i++) {
            tempArr2 = locationOfLayers.get(i);
            tempArr3 = locationOfLayers.get(i + 1);
            //System.out.println(tempArr2[0] + " " + tempArr2[1]);
            SSteps += Math.abs(tempArr2[0] - tempArr[0]);
            DSteps += Math.abs(tempArr2[1] - tempArr[1]);
            tempArr[0] = tempArr2[0];
            tempArr[1] = tempArr2[1];
        }
        System.out.println(SSteps + DSteps);
    }
}
