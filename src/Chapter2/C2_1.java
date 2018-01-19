package Chapter2;

import java.util.Scanner;

/**
 * Program to display Celsius to Fahrenheit to the console
 *
 * @author Tyler Bynum
 */

public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in celsius: ");
        double Celsius = input.nextDouble();

        double Fahrenheit = (9.0 / 5.0) * Celsius + 32;
        System.out.println(Celsius + "is" + Fahrenheit + " in fahrenheit");
    }
}
