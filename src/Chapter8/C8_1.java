package Chapter8;

import java.util.Arrays;

/**
 * program to display how many hours an employee worked on which days for the week to the console
 *
 * @author Tyler Bynum
 */
public class C8_1 {
    /**
     * Main Method
     * 
     * @param args arguments from the command line prompt
     */

    public static void main(String[] args) {

        int[][] hours = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}};

        int[] thing = sum(hours);

        //week hours
        int[] week = new int[hours.length];
        for (int i = 0; i < hours.length; i++) {
            for (int j = 0; j < hours[i].length; j++) {
                week[i] += hours[i][j];
            }
        }

        int[] indexList = new int[week.length];

        sort(week, indexList);

        for (int i = week.length - 1; i >= 0; i--) {
            System.out.println("Employee" + indexList[i] + " " + week[i]);
        }
        System.out.println("\t    Su M  T W  Th F Sa Total  ");

        for (int i = 0; i < hours.length; i++) {

            System.out.print("Employee " + i + ";");
            System.out.println(Arrays.toString(hours[i]) + " " + thing[i]);

        }

    }
    /**
     * 
     * @param list decides max list
     * @param indexList sorts the list from greatest to least
     */

    public static void sort(int[] list, int[] indexList) {
        int max;
        int x_max;

        for (int i = 0; i < indexList.length; i++) {
            indexList[i] = i;
        }

        for (int i = list.length - 1; i >= 1; i--) {

            max = list[i];
            x_max = i;

            for (int j = i - 1; j >= 0; j--) {
                if (max < list[j]) {
                    max = list[j];
                    x_max = j;
                }
            }

            if (x_max != i) {
                list[x_max] = list[i];
                list[i] = max;

                int temp = indexList[i];
                indexList[i] = indexList[x_max];
                indexList[x_max] = temp;
            }
        }
    }
/**
 * 
 * @param x variable to help sort the list
 * @return int
 */
    public static int[] sum(int[][] x) {
        int[] sum = new int[8];
        for (int i = 0; i < sum.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                sum[i] += x[i][j];
            }
        }
        return sum;
    }

}
