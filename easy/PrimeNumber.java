package easy;

import java.util.Scanner;

/**
 ** Implement a program that prompts the user for a number and prints whether
 ** it's prime or not.
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number to check if its prime number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        if (number <= 0) {
            System.out.println("Sorry! this number can not prime anyway!");
            sc.close();
            return;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(isPrime ? "The number is prime" : "The number is not prime");
        sc.close();

    }
}
