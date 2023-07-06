package org.example;

import java.util.Scanner;

public class PrimeNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a prime number");
        int input_number = scanner.nextInt();

        if(isPrime(input_number)) {
            System.out.println("The number " + input_number + " is a prime number");
        } else {
            System.out.println("The number " + input_number + " is not a prime number");
        }

    }

    static boolean isPrime(int input) {
        if(input <= 1) {
            return false;
        }
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }
}
