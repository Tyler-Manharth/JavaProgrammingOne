package Chapter5;

import java.util.Scanner;

/**
 * Program to display the output of ('1' + 1 + 1) to console
 *
 * @author Tyler Bynum
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'Y' for a vote yes, enter 'N' for a vote no, or 'Q' to quit voting ");
        String infadelInput = input.next().toUpperCase();

        int voteYes = 0;
        int voteNine = 0;
        int invalid = 0;
        int total = 0;
        char x = infadelInput.charAt(0);

        x = infadelInput.charAt(0);
        if (x == 'Y') {
            voteYes += 1;
        } else if (x == 'N') {
            voteNine += 1;
        } else if (x != 'Q' && x != 'Y' && x != 'N') {
            invalid += 1;
            System.out.println("INVALID, CORRECT VOTE. ");
        }

        while (x != 'Q') {
            System.out.println("Enter 'Y' for a vote yes, enter 'N' for a vote no, or 'Q' to quit voting ");
            infadelInput = input.next().toUpperCase();
            x = infadelInput.charAt(0);
            if (x == 'Y') {
                voteYes += 1;
            } else if (x == 'N') {
                voteNine += 1;
            } else if (x != 'Q' && x != 'Y' && x != 'N') {
                invalid += 1;
                System.out.println("INVALID, CORRECT VOTE. ");

            }
            total += 1;
        }
        System.out.println("\nThe voting results are: "
                + "\n\tYes votes :              " + voteYes + ""
                + "\n\tVotes no:                " + voteNine + ""
                + "\n\tInvalid votes:           " + invalid + ""
                + "\n\tTotal number of votes:   " + total);

    }
}
