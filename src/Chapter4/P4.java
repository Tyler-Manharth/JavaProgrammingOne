package Chapter4;

import java.util.Scanner;

/**
 * Program to display which bidder won, their hourly charge, name and hours of
 * work to the console
 *
 * @author Tyller Bynum
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();

        System.out.print("How many hours of work will you require?: ");
        int hours = input.nextInt();

        System.out.print("How much do you charge per hour?: ");
        double rate = input.nextDouble();

        System.out.print("\nPlease enter your name:");
        String name1 = input.next();

        System.out.print("How many hours of work will you require?: ");
        int hours1 = input.nextInt();

        System.out.print("How much do you charge per hour?: ");
        double rate1 = input.nextDouble();

        double cost = hours * rate;
        double cost1 = hours1 * rate1;

        System.out.println(hours * rate + " Is the cost for the first bidder");
        System.out.println(hours1 * rate1 + " Is the cost of the second bidder");
        if (cost < cost1) {
            System.out.println("The winner is " + name);
            System.out.printf("Cost of the winner is %.2f", cost);
            System.out.println(" Hours required for the winner are " + hours);
        }
        if (cost > cost1) {
            System.out.println("The winner is " + name1);
            System.out.printf("Cost of the winner is %.2f", cost1);
            System.out.println("The hours required for the winner is" + hours1);
        }
        if (cost == cost1 && hours < hours1) {
            System.out.println("The winner is " + name);
            System.out.printf("Cost of the winner is %.2f", cost);
            System.out.println("Hours required for the winner are" + hours);
        }
        if (cost == cost1 && hours > hours1) {
            System.out.println("The winner is " + name1);
            System.out.printf("Cost of the winner is %.2f", cost1);
            System.out.println("The hours required for the winner is" + hours1);
        }
        if (cost == cost1 && hours == hours1) {
            System.out.println("The winners are " + name + " and " + name1);
            System.out.println("Both " + name + " and " + name1 + " have identical bids");
            System.out.print("The required hours are " + hours + " and " + hours1);
            System.out.printf("\nTheir rates for bidder 1 are%.2f ", rate);
            System.out.printf("\nTheir rates for bidder 2 are%.2f ", rate1);
            System.out.printf("\nThe total cost for bidder 1 is %.2f ", cost);
            System.out.printf("\nThe total cost for bidder 2 is %.2f ", cost1);
        }

    }
}
