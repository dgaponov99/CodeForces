package Archive.A;

import java.util.HashMap;
import java.util.Scanner;

public class ExerciseOnLines {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final HashMap<Character, Boolean> vowel = new HashMap<>();
        vowel.put('a', true);
        vowel.put('o', true);
        vowel.put('y', true);
        vowel.put('e', true);
        vowel.put('u', true);
        vowel.put('i', true);

        final char characterInFrontOfConsonant = '.';

        StringBuilder treatedString = new StringBuilder("");

        String string = scanner.nextLine().toLowerCase();
        final byte len = (byte) string.length();

        Character aChar;
        for (byte i = 0; i < len; i++) {
            aChar = string.charAt(i);
            if (!vowel.containsKey(aChar)) {
                treatedString.append(characterInFrontOfConsonant).append(aChar);
            }
        }

        System.out.println(treatedString);
    }
}
