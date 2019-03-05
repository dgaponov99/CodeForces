import java.util.Scanner;

public class A_CorrectBracketSequence {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long cnt1 = scanner.nextLong();
        long cnt2 = scanner.nextLong();
        long cnt3 = scanner.nextLong();
        long cnt4 = scanner.nextLong();

        if (cnt1 == cnt4) {
            if (cnt3 > 0) {
                if (cnt1 > 0){
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                System.out.println(1);
            }
        } else {
            System.out.println(0);
        }
    }
}
