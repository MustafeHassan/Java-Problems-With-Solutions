package easy;

import java.util.Scanner;

/**
 ** Write a program to find the factorial of a given number using a loop
 */
public class FactorialNumber {

    public static void main(String[] args) {
        System.out.println("Enter a number to get the factorial: ");
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            int i = 1;
            int factorial = 1;
            while (i <= number) {
                factorial = factorial * i;
                i++;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
    }
}