package easy;

/**
 ** Find the maximum element in an array of integers.
 */
public class MaximumNumberOfArray {
    public static void main(String[] args) {
        int[] arr = { 3, 707, 10, 63 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element is " + max);

    }
}
