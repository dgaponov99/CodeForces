package Archive.A;

import java.util.Scanner;

public class MathematicsToTheRescue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder stringBuilder3 = new StringBuilder();

        String string = "+" + scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (i % 2 == 0) continue;
            switch (string.charAt(i)) {
                case ('1'):
                    stringBuilder1.append("+1");
                    break;
                case ('2'):
                    stringBuilder2.append("+2");
                    break;
                case ('3'):
                    stringBuilder3.append("+3");
                    break;
            }
        }
        System.out.println(stringBuilder1.append(stringBuilder2.append(stringBuilder3)).delete(0, 1));
    }
}
