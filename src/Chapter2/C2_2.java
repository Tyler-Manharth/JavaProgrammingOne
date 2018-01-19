package Chapter2;

import java.util.Scanner;

/**
 * Program to display the volume of the cylinder to the console
 *
 * @author Tyler Bynum
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount for radius and length: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * 3.14159;

        double volume = area * length;

        System.out.println("The volume for the Cylinder " + radius
                + volume + " is " + area + length);
    }
}
