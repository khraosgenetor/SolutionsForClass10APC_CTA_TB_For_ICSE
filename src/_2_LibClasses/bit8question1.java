package _2_LibClasses;

import java.util.Scanner;

// Made by Khraos on 11-10-2024
// System time is: 18:43 and the day is: Fri

public class bit8question1 {
    public static void main(String[] args) {
        char ch, chA;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        ch = in.nextLine().charAt(0);

        chA = (char) (10 + ch);
        System.out.println("The 10th character after " + ch + " is: '" + chA +"'.");
    }
}