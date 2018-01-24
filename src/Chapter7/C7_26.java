package Chapter7;

import java.util.Scanner;

/**
 * Program to display whether the two lists are identical or not to the console
 *
 * @author Tyler Bynum
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list: ");
        int[] list1 = new int[input.nextInt()];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.println("Enter list 2: ");
        int[] list2 = new int[input.nextInt()];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        if (equals(list1, list2)) {
            System.out.println("Two lists are strictly identical");
        } else {
            System.out.println("Two lists are not strictly identical");
        }

    }

    /**
     * Program decides if the arrays are equal
     * @param list1 compares list 1 to list 2
     * @param list2 compares list 2 to list 1
     * @return int
     */

    public static boolean equals(int[] list1, int[] list2) {
        return java.util.Arrays.equals(list1, list2); //this method checks if 2 lists are equal
    }
}
