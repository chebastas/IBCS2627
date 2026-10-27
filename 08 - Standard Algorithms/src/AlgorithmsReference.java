import java.util.Arrays;

public class AlgorithmsReference {

    public static int linearSearch(int[] values, int target) {

        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(int[] values, int target) {

        int low = 0;
        int high = values.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (values[mid] == target) {
                return mid;
            }

            if (values[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void bubbleSort(int[] values) {

        for (int pass = 0; pass < values.length - 1; pass++) {

            for (int i = 0; i < values.length - 1 - pass; i++) {

                if (values[i] > values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] values) {

        for (int i = 0; i < values.length - 1; i++) {

            int smallestIndex = i;

            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int temp = values[i];
            values[i] = values[smallestIndex];
            values[smallestIndex] = temp;
        }
    }

    public static void main(String[] args) {

        int[] values = {18, 5, 12, 3, 21, 9};

        System.out.println("Linear search for 12: " + linearSearch(values, 12));

        bubbleSort(values);
        System.out.println("Bubble sorted: " + Arrays.toString(values));
        System.out.println("Binary search for 21: " + binarySearch(values, 21));

        int[] secondValues = {18, 5, 12, 3, 21, 9};
        selectionSort(secondValues);
        System.out.println("Selection sorted: " + Arrays.toString(secondValues));
    }
}
