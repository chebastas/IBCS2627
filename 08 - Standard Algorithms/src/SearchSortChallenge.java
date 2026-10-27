import java.util.Arrays;

public class SearchSortChallenge {

    public static int linearSearch(int[] values, int target) {
        return -1;
    }

    public static int binarySearch(int[] values, int target) {
        return -1;
    }

    public static void sort(int[] values) {

    }

    public static void main(String[] args) {

        int[] values = {18, 5, 12, 3, 21, 9};

        System.out.println("Original: " + Arrays.toString(values));

        int firstResult = linearSearch(values, 12);
        System.out.println("Linear search result: " + firstResult);

        sort(values);
        System.out.println("Sorted: " + Arrays.toString(values));

        int secondResult = binarySearch(values, 21);
        System.out.println("Binary search result: " + secondResult);
    }
}
