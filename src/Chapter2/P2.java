package Chapter2;

import java.util.Scanner;

/**
 * Program to display the meal price before tax and tip, tax amount, tip amount,
 * and the total amount of the meal to the console
 *
 * @author Tyler Bynum
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter price for drinks: ");
        double drinkPrice = input.nextDouble();
        System.out.print("enter price for food: ");
        double foodPrice = input.nextDouble();
        System.out.print("enter price for desserts: ");
        double dessertPrice = input.nextDouble();

        double foodTotal = drinkPrice + foodPrice
                + dessertPrice;

        System.out.print("The total meal price before tax and tip is $ "
                + foodTotal);
        double mealTax = foodTotal * .1;
        double mealTip = (foodTotal * 1.1) * .15;
        double totalPayment = foodTotal + mealTax + mealTip;

        System.out.println("The tax is $" + mealTax);
        System.out.println("The tip amount is $" + mealTip);
        System.out.println("The total payment is $"
                + totalPayment);
        System.out.println("Thank you for ordering, Have a nice day!"
                + "It was my pleasure to serve you!");
    }
}
