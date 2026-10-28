public class Main {
    /* EXERCISE 1: LAUNCH COUNTDOWN
       Scenario: Build the display for a school launch demonstration.
       Input contract: n is from 0 to 20.
       PROVIDED: countdown is a complete worked example.
       TASK 1: Predict countdown(3) and countdown(0), then run them.
       TASK 2: Complete countUp. Print 1 to n, one number per line.
               For n = 0, print nothing. Use no loops.
       TASK 3: Trace countUp(3), including the return journey.
       RULE: At most one recursive call per invocation.
    */
    public static void main(String[] args) {
        System.out.println("Countdown from 3");
        countdown(3);
        System.out.println("Countdown from 0");
        countdown(0);
        System.out.println("Count up to 3: TODO result");
        countUp(3);
        System.out.println("Count up to 0: no numbers expected");
        countUp(0);
    }
    static void countdown(int n) {
        if (n == 0) {
            System.out.println("Launch!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }
    static void countUp(int n) {
        if (n == 0) {
            return;
        }
        // TODO: Call countUp for the smaller problem.
        // TODO: Print this call's n after the smaller call returns.
    }
}
