package org.example;

public class getFibo {
    public static int getFibonacciNumber(int n) {
        if (n < 2) {
            return n;
        } else {
            return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
        }
    }

    public static void main(String[] args) {
        int x = getFibonacciNumber(20);
        System.out.println(x);
    }
}
