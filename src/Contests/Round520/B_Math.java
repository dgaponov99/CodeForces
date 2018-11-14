package Contests.Round520;

import java.util.HashMap;
import java.util.Scanner;

//Да ну вас нафиг...

public class B_Math {
    static HashMap<Long, Long> hashMap = new HashMap<>();

    static void rec(long a, long b)
    {
        if(a==1)
            return;
        for(;;b++)
            if(a%b==0)
            {
                if (hashMap.containsKey(b)) {
                    hashMap.put(b, hashMap.get(b)+1);
                } else {
                    hashMap.put(b, 1L);
                }
                rec(a/b, b);
                return;
            }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        rec(a, 2);
        long max = 0;
        long min = Long.MAX_VALUE;
        long n = 1;
        for (long l: hashMap.keySet()) {
            long k = hashMap.get(l);
            if (k > max){
                max = k;
            }
            if (k < min) {
                min = k;
            }
            n *= l;
        }
        if (max % 2 == 1) {
            max++;
        }
        System.out.println(max);
        System.out.println(min);
        long count = max - min + max - 1;


        System.out.println(n + " " + count);
    }
}
