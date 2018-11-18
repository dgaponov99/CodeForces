import java.util.Scanner;

public class TooLongWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();

        String string;
        short len;
        for (int i = 0; i < n; i++) {
            string = scanner.nextLine();
            len = (short) string.length();
            if (len > 10)
                System.out.println("" + string.charAt(0) + (len - 2) + string.charAt(len - 1));
            else
                System.out.println(string);
        }
    }
}
