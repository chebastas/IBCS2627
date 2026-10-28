public class Main {
    /* EXERCISE 4: SUPPLY AUDIT
       Scenario: Count supplies and locate crates below a stock threshold.
       Input contract: a non-null array of non-negative item counts;
       index is from 0 to items.length inclusive. Use small totals.
       PROVIDED: main and fixed test data. Uncomment calls as you add methods.
       TASK 1: Write static int totalFrom(int[] items, int index).
       TASK 2: Write static int countLow(int[] items, int index, int threshold).
               Count values STRICTLY LESS than threshold.
       TASK 3: Add tests for one element, all zeros and threshold equality.
       RULES: No loops, array changes or global accumulators. At most one
              recursive call per invocation. Check the base case before
              accessing an element. Return results; main prints them.
    */
    public static void main(String[] args) {
        int[] items = {4, 0, 3, 8};
        int[] empty = {};
        System.out.println("Add the two methods, then uncomment the tests.");
        // System.out.println("Total expected 15: " + totalFrom(items, 0));
        // System.out.println("Suffix expected 11: " + totalFrom(items, 2));
        // System.out.println("Empty total expected 0: " + totalFrom(empty, 0));
        // System.out.println("Low expected 2: " + countLow(items, 0, 4));
        // System.out.println("Low suffix expected 1: " + countLow(items, 2, 4));
        // System.out.println("Empty count expected 0: " + countLow(empty, 0, 4));
    }
    // TODO: Add both method declarations and their recursive bodies here.
}
