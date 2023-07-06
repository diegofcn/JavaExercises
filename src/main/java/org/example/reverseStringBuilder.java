package org.example;

public class reverseStringBuilder {
    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("my name is xyz"));
        System.out.println(reverseString("I love coding"));
    }
}
