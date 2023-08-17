package easy;

public class EvenNumbers {
    /**
     ** Print the even numbers between 20 and 40 using a `while` loop.
     * 
     * @param args
     */
    public static void main(String[] args) {
        int initNumber = 20;
        while (initNumber <= 40) {
            System.out.println(initNumber % 2 == 0 ? initNumber : "");
            initNumber++;
        }
    }
}
