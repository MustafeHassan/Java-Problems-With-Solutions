package easy;

/**
 ** Write a program to print the Fibonacci sequence up to the 10th term
 */
public class Fibonnaci {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the sequence
        // int firstTerm = 0;
        // int secondTerm = 1;

        // System.out.println("Fibonacci Sequence:");
        // System.out.print(firstTerm + ", " + secondTerm);

        // for (int i = 2; i <= n; i++) {
        // int nextTerm = firstTerm + secondTerm;
        // System.out.print(", " + nextTerm);
        // firstTerm = secondTerm;
        // secondTerm = nextTerm;
        // }

        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + ", ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
