package Chapter3;

import java.util.Scanner;
import java.util.Random;

/**
 * Program to display if the users guess is correct or incorrect to the console
 *
 * @author Tyler Bynum
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int coin = random.nextInt(2);

        System.out.print("Flip a coin, Enter 1 for heads 0 for tails: ");
        int guess = input.nextInt();

        if (guess == coin) {
            System.out.println("Correct! You win 1 million dollars.");
        } else {
            System.out.println("You are the weakest link. Goodbye.");
        }

    }
}
