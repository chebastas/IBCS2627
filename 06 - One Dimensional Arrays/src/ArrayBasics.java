/*
 * ARRAY BASICS
 *
 * An array is a fixed-size collection of values of the same data type.
 *
 * KEY TERMS
 * ---------
 * Element: One value stored in an array.
 * Index: The position of an element in an array. Indexes start at 0.
 * Length: The number of elements an array can store.
 * Traversal: Visiting each element in an array, usually using a loop.
 */

public class ArrayBasics {

    public static void main(String[] args) {

        // --------------------------------------------------
        // 1. CREATE AN ARRAY
        // --------------------------------------------------

        // Method 1:
        // Create an empty integer array with space for 5 values.
        int[] scores = new int[5];

        // Integer arrays start with 0 in every position:
        //
        // Index:   0   1   2   3   4
        // Value:   0   0   0   0   0


        // Method 2:
        // Create an array and give it values immediately.
        int[] exampleScores = {85, 72, 91, 66, 80};

        // This also works with other data types.
        String[] playerNames = {"Alex", "Maya", "Leo"};


        // --------------------------------------------------
        // 2. WRITE VALUES TO AN ARRAY
        // --------------------------------------------------

        scores[0] = 85;
        scores[1] = 72;
        scores[2] = 91;

        // Add values to indexes 3 and 4.




        // --------------------------------------------------
        // 3. ACCESS VALUES
        // --------------------------------------------------

        System.out.println("First score: " + scores[0]);
        System.out.println("Third score: " + scores[2]);

        // Display the fifth score.




        // --------------------------------------------------
        // 4. CHANGE A VALUE
        // --------------------------------------------------

        scores[1] = 80;

        System.out.println("Updated second score: " + scores[1]);


        // --------------------------------------------------
        // 5. ARRAY LENGTH
        // --------------------------------------------------

        System.out.println("Number of scores: " + scores.length);


        // --------------------------------------------------
        // 6. TRAVERSE AN ARRAY
        // --------------------------------------------------

        // A loop can visit every element in the array.

        for (int i = 0; i < scores.length; i++) {

            System.out.println("Index " + i + ": " + scores[i]);

        }


        // --------------------------------------------------
        // QUICK CHECK
        // --------------------------------------------------

        // What value is stored at scores[0]?
        //
        // What value is stored at scores[2]?
        //
        // What is the final valid index of this array?
        //
        // What would happen if you tried to access scores[5]?
        //
        // Why does the loop use:
        //
        // i < scores.length
        //
        // instead of:
        //
        // i <= scores.length
    }
}