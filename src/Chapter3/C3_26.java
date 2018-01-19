package Chapter3;

import java.util.Scanner;

/**
 * Program to display how the number is (or is not) divisible by the numbers 5
 * and 6 to the console
 *
 * @author Tyler Bynum
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        //Recieve input
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by 5 and 6.");
        } else {
            System.out.println(number + " is not divisable by 5 and 6");
        }
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6.");
        } else {
            System.out.println(number + " is not divisable by 5 or 6");
        }
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6, but not both");
        } else {
            System.out.println(number + " is not divisible by 5 or 6");
        }
    }
}
