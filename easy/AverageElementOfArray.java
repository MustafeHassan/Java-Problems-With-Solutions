package easy;

/**
 ** Calculate the average of elements in an array.
 */
public class AverageElementOfArray {
    public static void main(String[] args) {
        int sum = 0;
        int average;
        int[] arr = { 32, 4, 45, 1 };
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        average = sum / arr.length;
        System.out.println("The average element is " + average);
    }
}
