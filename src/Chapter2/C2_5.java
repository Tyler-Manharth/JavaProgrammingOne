package Chapter2;

import java.util.Scanner;

/**
 * Program to display the gratuity price and total meal price to the console
 *
 * @author Tyler Bynum
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount: ");
        double subtotalAmount = input.nextDouble();

        System.out.print("Enter percent of gratuity: ");
        double gratuityAmount = input.nextDouble();
        double Grats = gratuityAmount / 100 * subtotalAmount;
        double totalPayment = subtotalAmount
                + Grats;

        System.out.println("The gratuity is $: " + Grats);

        System.out.println("The total payment is $"
                + totalPayment);
    }
}
