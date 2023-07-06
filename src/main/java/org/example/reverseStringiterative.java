package org.example;

public class reverseStringiterative {
    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String reverse = "";
        for (int i = ch.length-1; i >=0; i--) {
            reverse += ch[i];
        }
        return reverse;
    }
}
