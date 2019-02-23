import java.util.HashMap;
import java.util.Scanner;

public class C_PrefixesAndSuffixes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int number = 2 * n - 2;
        String[][] strings = new String[n - 1][2];
        String[] stringsInOrder = new String[number];
        for (int i = 0; i < number; i++) {
            String s = scanner.next();
            stringsInOrder[i] = s;
            int len = s.length();
            if (strings[len - 1][0] != null) {
                strings[len - 1][1] = s;
            } else strings[len - 1][0] = s;
        }
        /*for (int i = 0; i < n - 1; i++) {
            System.out.println(strings[i][0] + " " + strings[i][1]);
        }*/

        boolean[][] flags = new boolean[n - 1][2];
        for (int i = 0; i < n - 1; i++) {
            flags[i][0] = false;
            flags[i][1] = false;
        }

        //False = Суффиксы
        //True = Префиксы
        boolean flag = false;
        flags[n - 2][0] = true;
        for (int i = n - 2; i >= 1; i--) {
            String s;
            if (flags[i][0]) {
                s = strings[i][0].substring(0, i);
            } else {
                s = strings[i][1].substring(0, i);
            }
            if (strings[i - 1][0].equals(s)) {
                flags[i - 1][0] = true;
            } else if (strings[i - 1][1].equals(s)) {
                flags[i - 1][1] = true;
            } else {
                flag = true;
                break;
            }
        }

        if (flag) {
            for (int i = 0; i < n - 1; i++) {
                flags[i][0] = false;
                flags[i][1] = false;
            }
            flags[n - 2][1] = true;
            for (int i = n - 2; i >= 1; i--) {
                String s;
                if (flags[i][0]) {
                    s = strings[i][0].substring(0, i);
                } else {
                    s = strings[i][1].substring(0, i);
                }
                if (strings[i - 1][0].equals(s)) {
                    flags[i - 1][0] = true;
                } else
                    flags[i - 1][1] = true;
            }
        }

        /*for (int i = 0; i < n - 1; i++) {
            System.out.println(flags[i][0] + " " + flags[i][1]);
        }*/

        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            if (!hashMap.containsKey(strings[i][0])) {
                hashMap.put(strings[i][0], flags[i][0] ? 1 : 2);
            } else
                hashMap.put(strings[i][0], 3);

            if (!hashMap.containsKey(strings[i][1])) {
                hashMap.put(strings[i][1], flags[i][1] ? 1 : 2);
            } else
                hashMap.put(strings[i][1], 3);
        }


        //1 - P
        //2 - S
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            int a = hashMap.get(stringsInOrder[i]);
            if (a == 3) {
                hashMap.put(stringsInOrder[i], 2);
                stringBuilder.append('P');
            } else if (a == 2) {
                stringBuilder.append('S');
            } else {
                stringBuilder.append('P');
            }
        }
        System.out.println(stringBuilder);
    }
}
