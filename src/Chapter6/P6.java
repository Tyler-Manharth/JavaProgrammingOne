/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

        System.out.println("How many Euros will a dollar buy? ");
        //0.86
        double E = 0.86;
        System.out.println("€" + E);
        System.out.println("How many Pound Sterlings will a dollar buy? ");
        //£0.76
        double P = 0.76;
        System.out.println("£" + P);
        System.out.println("How much Yen will a dollar buy? ");
        //¥114.03
        double Y = 114.03;
        System.out.println("¥" + Y);
        System.out.println("Enter the ammount of dollars you want to convert.");
        double boi = input.nextDouble();
        double yeet = boi * P;
        double damb = boi * E;
        double ye = boi * Y;
        System.out.println("Enter \"E\" to buy Euro, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
        Scanner keyboard = new Scanner(System.in);
        Scanner value = new Scanner(System.in);

        String response = new Scanner(System.in).nextLine();

    }

}
