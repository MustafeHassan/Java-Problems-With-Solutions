package easy;

/**
 ** Calculate the sum of all odd numbers between 1 and 100 using a
 ** `do-while`loop.
 */
public class SumOddNumbers {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        do {
            if (i % 2 != 0) {
                sum += i;
            }
            i++;
        } while (i <= 100);

        System.out.println("The sum of all odd numbers between 1 and 100 is " + sum);
    }

}
