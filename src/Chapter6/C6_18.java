/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

import java.util.Scanner;

/**
 * Program to display if a password is valid or not to console
 *
 * @author Tyler Bynum
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String s = input.nextLine();

        if (chkPswd(s)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean chkPswd(String password) {
        boolean chkPswd = true;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetter(password.charAt(i))
                    && Character.isDigit(password.charAt(i))) {
                return false;
            }
        }
        if (password.length() >= 8) {
            chkPswd = true;
        }
        if (password.length() < 8) {
            chkPswd = false;
            System.out.println("A password must be at least 8 characters long");
        } else {
            int counter = 0;
            for (int i = 0; i < password.length(); i++) {
                if (!Character.isDigit(password.charAt(i))) {
                    ++counter;
                } else { // if a char in the password is not a letter or a number
                    chkPswd = false;
                    System.out.println("A password may only contain letters and digits");
                    break;
                }
            }
            if (counter < 2) {
                chkPswd = false;
            }
            System.out.println("A password must contain at least two digits.");
            return false;
        }
        int counter = 0;
        if (counter < 2) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean isLetter(char ch) {
        return ((ch <= 'z' && ch >= 'a') || (ch <= 'Z' && ch >= 'A'));
    }

    public static boolean isDigit(char ch) {
        return (ch <= '9' && ch >= '0');
    }
}
