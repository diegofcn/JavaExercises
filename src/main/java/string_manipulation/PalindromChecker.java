package string_manipulation;

import java.util.Scanner;

public class PalindromChecker {

    public static boolean isPalindrom(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ein Wort ein: ");
        String word = scanner.nextLine();

        System.out.println(isPalindrom(word));
    }
}
