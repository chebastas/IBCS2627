import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] values) {

        // Build the algorithm here.
    }

    public static void main(String[] args) {

        int[] values = {18, 5, 12, 3, 21, 9};

        System.out.println("Before: " + Arrays.toString(values));
        bubbleSort(values);
        System.out.println("After:  " + Arrays.toString(values));
    }
}
