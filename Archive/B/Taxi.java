import java.util.ArrayList;
import java.util.Scanner;

public class Taxi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int countTaxi;

        ArrayList<Integer> groups = new ArrayList<>(4);
        groups.add(0, 0);
        groups.add(1, 0);
        groups.add(2, 0);
        groups.add(3, 0);

        int group;
        for (int i = 0; i < n; i++) {
            group = scanner.nextInt();
            groups.set(group - 1, groups.get(group - 1) + 1);
        }

        countTaxi = groups.get(3);
        countTaxi += groups.get(2);
        groups.set(0, groups.get(0) - groups.get(2) > 0 ? groups.get(0) - groups.get(2) : 0);
        countTaxi += groups.get(1) / 2;
        int i1 = groups.get(0);
        if (groups.get(1) % 2 == 1) {
            countTaxi++;
            i1 = i1 - 2 > 0 ? i1 - 2 : 0;
        }
        countTaxi += i1 / 4;
        countTaxi += i1 % 4 > 0 ? 1 : 0;
        System.out.println(countTaxi);
    }
}
