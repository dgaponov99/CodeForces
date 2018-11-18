import java.util.*;

// Я не знаю что ему не понравилось

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



        StringBuilder stringBuilder = new StringBuilder();
        int size = 0;
        for (int i = n/k; i > 0; i--) {
            int count = 0;
            for (int a : map.keySet()) {
                if (map.get(a) >= i) {
                    count += map.get(a);
                }
            }
            if (count >= i*k) {
                size = i;
                break;
            }
        }

        for (int a : map.keySet()){
            if (map.get(a) >= size){
                for (int i = 0; i < map.get(a) / size; i++) {
                    stringBuilder.append(a).append(" ");
                    if (stringBuilder.length() >= k*2){
                        System.out.println(stringBuilder);
                        return;
                    }
                }
            }
        }


    }
}
