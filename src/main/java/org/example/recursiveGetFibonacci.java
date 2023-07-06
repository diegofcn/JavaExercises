package org.example;

public class recursiveGetFibonacci {
    public static int getFiboNumber(int n) {
        int last = 0;
        int next = 1;

        for (int i = 0; i < n; i++) {
            int old_last = last;
            last = next;
            next = old_last + next;
        }
        return next;
    }

    public static void main(String[] args) {
        int x = getFiboNumber(20);
        System.out.println(x);
    }
}
