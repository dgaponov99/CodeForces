import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        short n = scanner.nextShort();
        scanner.nextLine();

        short count = 0;

        for (short i = 0; i < n; i++) {
            if (scanner.nextByte() + scanner.nextByte() + scanner.nextByte() > 1) {
                count++;
            }
            scanner.nextLine();
        }
        System.out.println(count);
    }
}