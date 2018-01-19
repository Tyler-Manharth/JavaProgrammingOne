package Chapter4;

import java.util.Scanner;

/**
 * Program returns a value of the total pay an employee would receive in the
 * acquired job to console
 *
 * @author Tyler Bynum
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name:");
        String name = input.nextLine();

        System.out.print("Enter number of hours worked in a week:");
        double hours = input.nextDouble();

        System.out.print("Enter hourly pay rate:");
        double rate = input.nextDouble();

        System.out.print("Enter federal tax withholding rate:");
        double ftax = input.nextDouble();

        System.out.print("Enter state tax withholding rate:");
        double stax = input.nextDouble();

        System.out.println("Employee Name:" + name);
        System.out.println("Hours Worked:" + hours);
        System.out.println("Pay Rate: $" + rate);
        System.out.println("Gross Pay: $" + rate * hours);
        System.out.println("Deduction:");
        System.out.printf("Federal Withholding (%.2f%%): $%.2f\n", ftax * 100,
                ftax * rate * hours);
        System.out.printf("State Withholding (%.2f%%): $%.2f\n", stax * 100,
                stax * rate * hours);
        System.out.printf("Total Deduction: $%.2f\n", (stax + ftax) * rate
                * hours);
        System.out.printf("Net Pay: $%.2f\n", (1 - stax - ftax) * rate * hours);

    }
}
