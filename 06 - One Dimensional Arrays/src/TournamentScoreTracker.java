import java.util.Scanner;

/*
 * EXERCISE 6 - TOURNAMENT SCORE TRACKER
 *
 * SCENARIO
 * --------
 * A player competes in five rounds of a gaming tournament.
 *
 * The tournament system needs to store every score so that
 * the scores can be analysed after all rounds are complete.
 *
 * Your program should:
 *
 * 1. Ask for the player's name.
 * 2. Store 5 tournament scores in an array.
 * 3. Display all stored scores.
 * 4. Calculate the total score.
 * 5. Calculate the average score.
 * 6. Find the highest score.
 * 7. Find the lowest score.
 */

public class TournamentScoreTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String playerName;


        // --------------------------------------------------
        // TASK 1 - CREATE THE ARRAY
        // --------------------------------------------------
        // Create an integer array called scores
        // that can store 5 scores.





        // --------------------------------------------------
        // PLAYER INPUT
        // --------------------------------------------------

        System.out.print("Enter player name: ");
        playerName = input.nextLine();


        // --------------------------------------------------
        // TASK 2 - STORE SCORES
        // --------------------------------------------------
        // Use a for loop to ask for each score.
        //
        // Store each score in the correct position
        // in the scores array.
        //
        // Example:
        //
        // Enter score for round 1: 85
        //
        // Remember:
        // the array index starts at 0,
        // but the round number shown to the user starts at 1.





        // --------------------------------------------------
        // TASK 3 - DISPLAY STORED SCORES
        // --------------------------------------------------
        // Use a loop to display every score.
        //
        // Example:
        //
        // Round 1: 85
        // Round 2: 72





        // --------------------------------------------------
        // TASK 4 - TOTAL
        // --------------------------------------------------
        // Create a variable to store the total.
        //
        // Traverse the array and add each score
        // to the total.





        // --------------------------------------------------
        // TASK 5 - AVERAGE
        // --------------------------------------------------
        // Calculate the average score.
        //
        // Use scores.length rather than typing 5.
        //
        // Think about the data type of the result.





        // --------------------------------------------------
        // TASK 6 - HIGHEST SCORE
        // --------------------------------------------------
        // Create a highestScore variable.
        //
        // Start with:
        //
        // int highestScore = scores[0];
        //
        // Then check the remaining values in the array.
        // If a score is higher than highestScore,
        // update highestScore.





        // --------------------------------------------------
        // TASK 7 - LOWEST SCORE
        // --------------------------------------------------
        // Use the same idea to find the lowest score.
        //
        // Start with:
        //
        // int lowestScore = scores[0];





        // --------------------------------------------------
        // OUTPUT
        // --------------------------------------------------

        System.out.println();
        System.out.println("----- TOURNAMENT SUMMARY -----");
        System.out.println("Player: " + playerName);

        // Display:
        // total score
        // average score
        // highest score
        // lowest score

    }
}