import java.util.Scanner;
public class Main {
    /* EXERCISE 3: PARCEL CHECKSUM
       Scenario: A classroom parcel checker totals the digits of a label.
       Its check digit is the digit total modulo 10.
       Input contract: whole number 0 to 999999, with no leading zeros.
       PROVIDED: input, parsing, range validation, output and test calls.
       TASK 1: Construct digitSum using arithmetic and recursion.
       TASK 2: Construct checksum using the result from digitSum.
       TASK 3: Trace digitSum(1002) and explain the return values.
       RULES: No loops, String conversion or global accumulator in your
              methods. At most one recursive call per invocation.
    */
    public static void main(String[] args) {
        System.out.println("digitSum tests: expected 0, 7, 13, 3, 18");
        System.out.println(digitSum(0));
        System.out.println(digitSum(7));
        System.out.println(digitSum(472));
        System.out.println(digitSum(1002));
        System.out.println(digitSum(909));
        Scanner input = new Scanner(System.in);
        System.out.print("Label number from 0 to 999999: ");
        int label = Integer.parseInt(input.nextLine());
        if (label < 0 || label > 999999) {
            System.out.println("Outside the permitted range.");
            input.close();
            return;
        }
        System.out.println("Digit total: " + digitSum(label));
        System.out.println("Check digit: " + checksum(label));
        input.close();
    }
    static int digitSum(int n) {
        // TODO: Solve a one-digit number directly; reduce larger numbers.
        return -1; // Placeholder: replace this.
    }
    static int checksum(int n) {
        // TODO: Use digitSum; this method need not call itself.
        return -1; // Placeholder: replace this.
    }
}
