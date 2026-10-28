public class Main {
    /* EXERCISE 2: STADIUM SEATING
       Scenario: Plan a stand and count arrangements of its flags.
       Input contract: rows and n are from 0 to 10.
       PROVIDED: totalSeats is a complete worked example.
       TASK 1: Trace totalSeats(4), showing calls AND returned values.
       TASK 2: Complete premiumSeats: row r contains 2 * r seats.
       TASK 3: Complete arrangements: return n factorial.
               Zero flags have one empty arrangement.
       RULES: No loops or global accumulators. Return, do not print,
              inside the calculation methods. At most one recursive call
              per invocation. Main is already provided.
    */
    public static void main(String[] args) {
        System.out.println("Total seats for 4 rows: " + totalSeats(4));
        System.out.println("Premium seats 0, expected 0: " + premiumSeats(0));
        System.out.println("Premium seats 1, expected 2: " + premiumSeats(1));
        System.out.println("Premium seats 3, expected 12: " + premiumSeats(3));
        System.out.println("Arrangements 0, expected 1: " + arrangements(0));
        System.out.println("Arrangements 1, expected 1: " + arrangements(1));
        System.out.println("Arrangements 4, expected 24: " + arrangements(4));
    }
    static int totalSeats(int rows) {
        if (rows == 0) return 0;
        int earlierRows = totalSeats(rows - 1);
        return rows + earlierRows;
    }
    static int premiumSeats(int rows) {
        // TODO: Base case, smaller call and combination.
        return -1; // Placeholder: replace this.
    }
    static int arrangements(int n) {
        // TODO: Choose the base result for multiplication carefully.
        return -1; // Placeholder: replace this.
    }
}
