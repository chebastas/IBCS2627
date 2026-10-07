import java.util.Scanner;

/*
 * EXERCISE 3 - 7-DAY STEP CHALLENGE
 *
 * SCENARIO
 * --------
 * A fitness app runs a seven-day walking challenge.
 *
 * The program needs to collect the number of steps completed
 * each day and produce a weekly summary.
 *
 * Your program should:
 *
 * 1. Ask for the user's name.
 * 2. Ask for their daily step goal.
 * 3. Ask for the number of steps completed on each of 7 days.
 * 4. Calculate the total number of steps.
 * 5. Count how many days the user reached their goal.
 * 6. Calculate the average number of steps per day.
 * 7. Display a weekly summary.
 *
 * Some parts of the program have already been completed.
 * Your main task is to complete the loop.
 */

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        // VARIABLES
        String name;
        int dailyGoal;
        int steps;
        int totalSteps = 0;
        int goalDays = 0;
        double averageSteps;


        // INPUT
        // This section has been completed for you.

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your daily step goal: ");
        dailyGoal = Integer.parseInt(input.nextLine());


        // --------------------------------------------------
        // TASK 1 - DAILY STEP LOOP
        // --------------------------------------------------
        // Use a for loop that repeats 7 times.
        //
        // Each time through the loop:
        //
        // 1. Ask the user how many steps they completed.
        // 2. Add those steps to totalSteps.
        // 3. If the steps are greater than or equal to
        //    dailyGoal, increase goalDays by 1.
        //
        // The prompt should tell the user which day
        // they are entering.
        //
        // Example:
        // Enter steps for day 1: 8500






        // --------------------------------------------------
        // TASK 2 - WEEKLY CALCULATIONS
        // --------------------------------------------------
        // Calculate the average number of steps per day.
        //
        // Think carefully about the data type used
        // in the calculation.





        // OUTPUT
        // This section has been completed for you.

        System.out.println();
        System.out.println("----- WEEKLY SUMMARY -----");
        System.out.println("Name: " + name);
        System.out.println("Total steps: " + totalSteps);
        System.out.println("Average steps: " + averageSteps);
        System.out.println("Days goal reached: " + goalDays + " out of 7");
    }
}
