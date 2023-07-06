package string_manipulation;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class DeleteDuplicates {
    public static String removeDuplicates(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ein Wort ein: ");
        String input = scanner.nextLine();

        System.out.println(removeDuplicates(input));
    }
}
