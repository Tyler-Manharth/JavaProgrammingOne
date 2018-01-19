package Chapter3;

import java.util.Scanner;

/**
 * Program to display which number of the two is greater, your grade, if it can
 * be divided by zero, if it is proper or improper, if it is in range or out of
 * range to the console
 *
 * @author Tyler Bynum
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st variable.");
        double one = input.nextDouble();

        System.out.println("Enter 2nd variable.");
        double two = input.nextDouble();

        System.out.print("Variable 1 is: " + one);
        System.out.print("\nVariable 2 is: " + two);

        if (one < two) {
            System.out.println("\nThe first number is less than the second");
        }
        if (one > two) {
            System.out.print("\nThe first number is greater than the second");
        }
        if (one == two) {
            System.out.print("\nThe first number is equal to the second");
        }
        if (one != two) {
            System.out.print("\nThe first number is not equal to the second");
        }
        if (two == 0) {
            System.out.print("\nCannot divide by zero");
        } else if (one / two < 1) {
            System.out.print("\nProper fraction");
        } else if (one / two > 1) {
            System.out.print("\nImproper fraction");
        }
        if (one >= 90) {
            System.out.print("\nA");
        } else if (one >= 80) {
            System.out.print("\nB");
        } else if (one >= 70) {
            System.out.print("\nC");
        } else if (one >= 60) {
            System.out.print("\nD");
        } else if (one < 60) {
            System.out.print("\nF");
        }
        if (1 < two && two < 100) {
            System.out.print("\nIn range");
        } else if (1 > two || two > 100) {
            System.out.print("\nOut of range");
        }
    }
}
