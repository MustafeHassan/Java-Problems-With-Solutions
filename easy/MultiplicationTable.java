package easy;

import java.util.Scanner;

/**
 ** Create a program that generates a multiplication table for a given number.
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to multiplication table");
        System.out.println("Enter a number to get it's table multiplication: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.print(number + " * " + i + " = " + number * i + "\n");
        }
        scanner.close();
    }
}
