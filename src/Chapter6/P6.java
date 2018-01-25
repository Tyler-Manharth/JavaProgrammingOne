package Chapter6;

import java.util.Scanner;

/**
 * Program to display a converted amount of money to console
 *
 * @author Tyler Bynum
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String more = "";
        System.out.println("How many Euros will a dollar buy? ");
        double Euro = input.nextDouble();
        System.out.println("How many Pound Sterlings will a dollar buy? ");
        double Pound = input.nextDouble();
        System.out.println("How much Yen will a dollar buy? ");
        double Yen = input.nextDouble();

        do {
            System.out.println("Enter the ammount of dollars you want to convert: ");
            double d1 = input.nextDouble();

            System.out.println("Press /'E/' to buy Euros /'P/' to buy Pounds and /'Y/' to buy Yen");
            char type = input.next().toLowerCase().charAt(0);

            if (type == 'e') {
                double eFinal = convert(Euro, d1);
                System.out.printf("For %.2f dollars, you will be able to buy "
                        + "%.2f Euros", d1, eFinal);
            } else if (type == 'p') {
                double pFinal = convert(Pound, d1);
                System.out.printf("For %.2f dollars, you will be able to buy "
                        + "%.2f Pounds", d1, pFinal);
            } else if (type == 'y') {
                double yFinal = convert(Yen, d1);
                System.out.printf("For %.2f dollars, you will be able to buy "
                        + "%.2f Yen", d1, yFinal);
            }
            do {
                System.out.println("Are there more conversions to preform?");
                more = input.next();
            } while (!more.equalsIgnoreCase("yes") && !more.equalsIgnoreCase("no"));

        } while (more.equalsIgnoreCase("yes"));
    }
/**
 * Program converts given amount to different currency
 * @param c1 converted amount
 * @param d1 given amount
 * @return double
 */
    public static double convert(double c1, double d1) {
        double dFin = 0;
        if (d1 > 100) {
            dFin = d1 * 0.05;
            d1 = d1 - dFin;
        } else {
            dFin = d1 * 0.10;
            d1 = d1 - dFin;
        }
        double answer = d1 * c1;
        return answer;
    }
}
