package primenumbers;

import java.util.Scanner;

public class PrimeNumbers {

    static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    static boolean isPrimeSqrt(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value, this value will be considered as the upper limit!");
        int isPrime = scanner.nextInt();
        if (isPrime(isPrime)) {
            System.out.println(isPrime + " is a prime number.");
        } else {
            System.out.println(isPrime + " is not a prime number!");
        }

        for (int i = 2; i <= isPrime; i++) {
            if (isPrimeSqrt(i))
                System.out.print("[ " + i + " ]");
        }

        scanner.close();
    }
}
