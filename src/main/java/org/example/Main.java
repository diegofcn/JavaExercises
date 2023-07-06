package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int length = 50;

        long[] fibonacci = new long[length];
        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i=2; i < length; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        for (int i = 0; i < fibonacci.length; i++) {
            System.out.println(fibonacci[i] + ", ");
        }
    }
}