package string_manipulation;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagram(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ein Wort ein: ");
        String input1 = scanner.nextLine();
        System.out.println("Geben Sie noch ein Wort ein: ");
        String input2 = scanner.nextLine();

        System.out.println(areAnagram(input1, input2));
    }
}
