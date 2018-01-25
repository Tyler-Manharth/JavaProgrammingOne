package Chapter7;

import java.util.Scanner;

/**
 * Program to display the array input and the average to the console
 *
 * @author Tyler Bynum
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers will be read: ");
        int number = input.nextInt();
        int[] array = new int[number];
        System.out.println("Enter " + array.length + " elements: ");

        fillArray(array, input);

    }

    /**
     * Program decides the average of the array
     *
     * @param array array used in command line prompt
     * @param input scanner imported
     */
    public static void fillArray(int[] array, Scanner input) {
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        int arrayAverage = (total / array.length);
        System.out.println("The average is " + arrayAverage);
        for (int e : array) {
            System.out.print(e + " ");
        }
    }
}
