import java.util.Scanner;

public class A_NewYearAndChristmasOrnament {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int b = scanner.nextInt();
        int r = scanner.nextInt();
        while (true) {
            if (b >= y + 1 && r >= y + 2){
                System.out.println(3*y + 3);
                break;
            }
            y--;
        }
    }
}
