package Chapter7;

import java.util.Scanner;

/**
 * Program to display the minimum of ten numbers to the console
 *
 * @author Tyler Bynum
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from the command line prompt
     */

    public static void main(String[] args) {
        System.out.println("Enter ten numbers: ");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.print("The minimum number is: " + min(numbers));
    }

    /**
     * Program decides the minimum of the array
     * @param array to decide the minimum of ten numbers
     * @return double
     */
    public static double min(double[] array) {

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
