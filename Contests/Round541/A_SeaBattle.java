import java.util.Scanner;

public class A_SeaBattle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long w1 = scanner.nextLong();
        long h1 = scanner.nextLong();
        long w2 = scanner.nextLong();
        long h2 = scanner.nextLong();
        System.out.println(2*(w1 + h1 + h2 + 2));
    }
}
