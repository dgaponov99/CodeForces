import java.util.*;

// Я не знаю что ему не понравилось

// Теперь знаю что...

// Ураааааа

public class D_ArrayCutting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }

        if (k == 1) {
            int max = 0;
            int maxA = 0;
            for (int a : map.keySet()){
                if (map.get(a) > max) {
                    max = map.get(a);
                    maxA = a;
                }
            }
            System.out.println(maxA);
            return;
        }


        HashMap<Integer, Integer> element = new HashMap<>();
        for (int i = n/k; i > 0; i--) {
            int count = 0;
            for (int a : map.keySet()) {
                if (map.get(a) >= i) {
                    count += (map.get(a) / i) * i;
                    element.put(a, map.get(a) / i);
                }
            }
            if (count >= i*k) {
                break;
            }
            element.clear();
        }

        int sum = 0;
        for (int e: element.keySet()) {
            for (int i = 0; i < element.get(e); i++) {
                System.out.print(e + " ");
                sum++;
                if (sum >= k){
                    return;
                }
            }
        }
    }
}
