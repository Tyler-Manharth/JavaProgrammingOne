package Chapter3;

import java.util.Scanner;

/**
 * Program to display which rice is cheaper to the console
 *
 * @author Tyler Bynum
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter price of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter weight of the 2nd rice in pounds: ");
        double weight1 = input.nextDouble();

        System.out.print("Enter price of 2nd rice: ");
        double price1 = input.nextDouble();

        double rice = weight / price;

        double rice1 = weight1 / price1;

        if (rice == rice1) {
            System.out.println("equal costs");
        } else if (rice > rice1) {
            System.out.println("Rice 1 is cheaper");
        } else if (rice < rice1) {
            System.out.println("Rice 2 is cheaper");
        }
    }
}
