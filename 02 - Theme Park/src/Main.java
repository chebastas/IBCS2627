import java.util.Scanner;

/*
 * EXERCISE 2 - THEME PARK TICKET & RIDE CHECK
 *
 * SCENARIO
 * --------
 * A theme park needs a program to calculate ticket prices
 * and check whether visitors are allowed on one of its rides.
 *
 * Ticket prices:
 * - Under 5 years old: free
 * - Ages 5-12: 50 RMB
 * - Ages 13-64: 100 RMB
 * - Ages 65 and over: 60 RMB
 *
 * Ride requirements:
 * - The visitor must be at least 120 cm tall
 * - The visitor must be at least 10 years old
 *
 * Some of the program has already been written for you.
 * Your job is to complete the decision-making sections.
 */

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // VARIABLES
        String name;
        int age;
        int height;
        int ticketPrice = 0;
        boolean canRide = false;


        // INPUT
        // This section has been completed for you.

        System.out.print("Enter visitor name: ");
        name = input.nextLine();

        System.out.print("Enter age: ");
        age = Integer.parseInt(input.nextLine());

        System.out.print("Enter height in cm: ");
        height = Integer.parseInt(input.nextLine());


        // --------------------------------------------------
        // TASK 1 - TICKET PRICE
        // --------------------------------------------------
        // Use if / else if / else to assign the correct
        // ticket price to the variable ticketPrice.
        //
        // Remember:
        // Under 5       -> 0 RMB
        // Ages 5-12     -> 50 RMB
        // Ages 13-64    -> 100 RMB
        // Ages 65+      -> 60 RMB





        // --------------------------------------------------
        // TASK 2 - RIDE CHECK
        // --------------------------------------------------
        // A visitor can ride only if BOTH conditions are true:
        //
        // - height is at least 120 cm
        // - age is at least 10
        //
        // Use an if statement to set canRide to true
        // when the visitor meets both requirements.





        // OUTPUT
        // This section has been completed for you.

        System.out.println();
        System.out.println("----- VISITOR SUMMARY -----");
        System.out.println("Visitor: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Ticket price: " + ticketPrice + " RMB");
        System.out.println("Can ride: " + canRide);
    }
}