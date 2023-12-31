package string_manipulation;

import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i>=0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ein Wort oder einen Satz ein: ");
        String input = scanner.nextLine();

        System.out.println(reverseString(input));
    }
}
