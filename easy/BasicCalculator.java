package easy;

import java.util.Scanner;

/**
 ** Implement a basic calculator that can perform addition, subtraction,
 ** multiplication, and division operations.
 */
public class BasicCalculator {
    public static void main(String[] args) {
        System.out.println("********************************");
        System.out.println("Welcome to basic calculator");
        System.out.println("Choose one operation: ");
        System.out.println(
                """
                         1 - Addition (+)
                         2 - Subtraction (-)
                         3 - Multiplication (x)
                         4 - Division (/)
                        """);
        try (Scanner input = new Scanner(System.in)) {
            int op = input.nextInt();
            switch (op) {
                case 1:
                    add(input);
                    break;
                case 2:
                    sub(input);
                    break;
                case 3:
                    mul(input);
                    break;
                case 4:
                    div(input);
                    break;

                default:
                    System.out.println("Invalid option selected ....");
                    break;
            }
        }

    }

    /**
     * @param Scanner input
     * @return int
     */
    static int add(Scanner input) {
        System.out.println("Enter a number: ");
        int n1 = input.nextInt();
        System.out.println("Enter a number: ");
        int n2 = input.nextInt();
        System.out.println("The " + n1 + " + " + n2 + " is " + (n1 + n2));
        return n1 + n2;
    }

    /**
     * @param Scanner input
     * @return int
     */
    static int sub(Scanner input) {
        System.out.println("Enter a number: ");
        int n1 = input.nextInt();
        System.out.println("Enter a number: ");
        int n2 = input.nextInt();
        System.out.println("The " + n1 + " - " + n2 + " is " + (n1 - n2));
        return n1 - n2;
    }

    /**
     * @param Scanner input
     * @return int
     */
    static int mul(Scanner input) {
        System.out.println("Enter a number: ");
        int n1 = input.nextInt();
        System.out.println("Enter a number: ");
        int n2 = input.nextInt();
        System.out.println("The " + n1 + " x " + n2 + " is " + (n1 * n2));
        return n1 * n2;
    }

    /**
     * @param Scanner input
     * @return int
     */
    static int div(Scanner input) {
        System.out.println("Enter a number: ");
        int n1 = input.nextInt();
        System.out.println("Enter a number: ");
        int n2 = input.nextInt();
        try {
            System.out.println("The " + n1 + " / " + n2 + " is " + (n1 / n2));
            return n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("Can not divide by zero");
            return 0;
        }
    }

}
