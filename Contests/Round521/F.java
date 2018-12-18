import java.util.*;

public class F {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<Long, Integer> tasks = new HashMap<>();

        int k = 20001;
        long[][] countTask = new long[k][2];

        HashMap<Long, Integer>[] includes = new HashMap[k];
        for (int i = 0; i < k; i++) {
            includes[i] = new HashMap<>();
        }
        for (int i = 0; i < n; i++) {
            long t = scanner.nextLong();
            if (tasks.containsKey(t)) {
                tasks.put(t, tasks.get(t) + 1);
                includes[tasks.get(t) - 1].remove(t);
                includes[tasks.get(t)].put(t, null);
            } else {
                tasks.put(t, 1);
                includes[1].put(t, null);
            }
        }

        int count = 0;
        int min = -1;
        int pre_i = k;
        int i = k - 1;
        while (i > 0 && pre_i > 1) {
            long t = includes[i].size();
            if (t > 0) {
                if (pre_i == k){
                    pre_i = i;
                    min = pre_i;
                    i--;
                    count += t;
                    //System.out.println(min);
                    continue;
                }

                if (i >= pre_i / 2) {
                    min = pre_i/2;
                    pre_i /= 2*t;
                    if (pre_i < 1){
                        pre_i = 1;
                    }
                } else {
                    min = i;
                    pre_i = i;
                }
                count += t;
            }
            i--;
        }

        System.out.println(Arrays.toString(includes));
        System.out.println(min);
        System.out.println(count);
        System.out.println((int) (min*(Math.pow(2, count) - 1)));

    }
}
