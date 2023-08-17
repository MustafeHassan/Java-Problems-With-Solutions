package easy;

import java.util.Random;
import java.util.Scanner;

/**
 ** Create a program that generates a random number between 1 and 100 and lets
 ** the user guess it.
 * 
 */
public class RandomNumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        Scanner scanner = new Scanner(System.in);
        int guess;
        int numberOfGuesses = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between 1 and 100. Try to guess it.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfGuesses++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number " + randomNumber + " in " + numberOfGuesses
                        + " guesses.");
                hasGuessedCorrectly = true;
            }
        }

        scanner.close();
    }
}
