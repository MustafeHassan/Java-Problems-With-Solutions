package easy;

/**
 ** Count the number of occurrences of a specific number in an array.
 */
public class OccurrencesOfNumber {
    public static void main(String[] args) {

        int[] array = { 3, 2, 2, 5, 10 };
        int number = 40;
        System.out.println("The number of occurences of " + number + " is " + checkNumberOfOccurences(array, number));

    }

    static public int checkNumberOfOccurences(int[] arr, int number) {
        int occurrences = 0;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                occurrences += 1;
            }
        }
        return occurrences;
    }
}
