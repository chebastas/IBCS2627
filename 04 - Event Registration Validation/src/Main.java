import java.util.Scanner;

/*
 * EXERCISE 4 - EVENT REGISTRATION VALIDATOR
 *
 * SCENARIO
 * --------
 * A school event uses a registration kiosk.
 *
 * The kiosk must make sure that certain information is valid
 * before allowing the registration to continue.
 *
 * Rules:
 * - Participants must be between 11 and 18 years old.
 * - Group size must be between 1 and 6 people.
 * - The event access code is 2468.
 *
 * Your task is to use while loops to keep asking for
 * information until valid values are entered.
 *
 * Some parts of the program have already been completed.
 */

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int age;
        int groupSize;
        int accessCode;
        int attempts = 1;


        // --------------------------------------------------
        // TASK 1 - VALIDATE AGE
        // --------------------------------------------------
        // The first input has been completed for you.
        //
        // Use a while loop to keep asking if the age
        // is below 11 OR above 18.

        System.out.print("Enter participant age: ");
        age = Integer.parseInt(input.nextLine());






        // --------------------------------------------------
        // TASK 2 - VALIDATE GROUP SIZE
        // --------------------------------------------------
        // A valid group contains between 1 and 6 people.
        //
        // Use a while loop to keep asking until the
        // group size is valid.

        System.out.print("Enter group size: ");
        groupSize = Integer.parseInt(input.nextLine());






        // --------------------------------------------------
        // TASK 3 - ACCESS CODE
        // --------------------------------------------------
        // The correct event access code is 2468.
        //
        // Keep asking until the correct code is entered.
        //
        // Each time another code is entered,
        // increase attempts by 1.

        System.out.print("Enter access code: ");
        accessCode = Integer.parseInt(input.nextLine());






        // OUTPUT
        // This section has been completed for you.

        System.out.println();
        System.out.println("----- REGISTRATION COMPLETE -----");
        System.out.println("Participant age: " + age);
        System.out.println("Group size: " + groupSize);
        System.out.println("Access code attempts: " + attempts);
    }
}