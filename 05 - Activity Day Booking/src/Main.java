import java.util.Scanner;

/*
 * EXERCISE 5 - ACTIVITY DAY BOOKING REFACTOR
 *
 * SCENARIO
 * --------
 * The school has created a program for booking activities
 * during Activity Day.
 *
 * The program works, but almost everything has been written
 * inside main().
 *
 * As the program grows, it is becoming difficult to read,
 * test and maintain.
 *
 * Your task is to DECOMPOSE the program into smaller methods
 * without changing what the program does.
 *
 * Create these methods:
 *
 * displayWelcome()
 * - Displays the welcome message.
 *
 * getActivityName(int activityChoice)
 * - Returns the name of the selected activity.
 *
 * calculateBaseFee(int activityChoice)
 * - Returns the price of the selected activity.
 *
 * applyDiscount(double fee, boolean hasPass)
 * - Returns the fee after applying the Activity Pass discount.
 *
 * displaySummary(String name, String activityName, double finalFee)
 * - Displays the final booking information.
 *
 * Refactor one part at a time and test the program
 * after each change.
 */

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // --------------------------------------------------
        // WELCOME
        // --------------------------------------------------

        System.out.println("----- ACTIVITY DAY BOOKING -----");
        System.out.println("Choose an activity and calculate the booking fee.");
        System.out.println();


        // --------------------------------------------------
        // INPUT
        // --------------------------------------------------

        System.out.print("Enter participant name: ");
        String name = input.nextLine();

        System.out.println();
        System.out.println("1. Robotics");
        System.out.println("2. Climbing");
        System.out.println("3. Cooking");

        System.out.print("Choose an activity: ");
        int activityChoice = Integer.parseInt(input.nextLine());

        System.out.print("Do you have an Activity Pass? (yes/no): ");
        String passInput = input.nextLine();

        boolean hasPass = passInput.equalsIgnoreCase("yes");


        // --------------------------------------------------
        // DETERMINE ACTIVITY
        // --------------------------------------------------

        String activityName;

        if (activityChoice == 1) {
            activityName = "Robotics";
        } else if (activityChoice == 2) {
            activityName = "Climbing";
        } else {
            activityName = "Cooking";
        }


        // --------------------------------------------------
        // CALCULATE BASE FEE
        // --------------------------------------------------

        double baseFee;

        if (activityChoice == 1) {
            baseFee = 80.0;
        } else if (activityChoice == 2) {
            baseFee = 100.0;
        } else {
            baseFee = 60.0;
        }


        // --------------------------------------------------
        // APPLY DISCOUNT
        // --------------------------------------------------
        // Activity Pass holders receive a 10% discount.

        double finalFee = baseFee;

        if (hasPass) {
            finalFee = baseFee * 0.90;
        }


        // --------------------------------------------------
        // OUTPUT
        // --------------------------------------------------

        System.out.println();
        System.out.println("----- BOOKING SUMMARY -----");
        System.out.println("Participant: " + name);
        System.out.println("Activity: " + activityName);
        System.out.println("Final fee: " + finalFee + " RMB");
    }


    // --------------------------------------------------
    // METHODS
    // --------------------------------------------------
    // Create your methods below.
    //
    // Refactor the existing code rather than simply
    // copying it and leaving the original code in main.





}